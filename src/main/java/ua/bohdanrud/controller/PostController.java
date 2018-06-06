package ua.bohdanrud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.bohdanrud.entity.Post;
import ua.bohdanrud.entity.User;
import ua.bohdanrud.service.PostService;
import ua.bohdanrud.service.UserService;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	private UserService userService;

	@Autowired
	private PostService postService;

	private int tempPostId;

	private int tempUserId;

	@GetMapping("/add-post")
	public String showAddPost(Model model) {
		model.addAttribute("postModel", new Post());
		return "post/add-post";
	}

	@PostMapping("/add-post")
	public String savePost(@Valid @ModelAttribute("postModel") Post post, BindingResult br) {
		if (br.hasErrors()) {
			return "post/add-post";
		}
		postService.savePost(post);
		return "redirect:/";
	}

	@GetMapping("/posts")
	public String showAllPosts(Model model) {
		model.addAttribute("postsList", postService.findAllPosts());
		return "post/posts";
	}

	@GetMapping("/posts/like/{postId}")
	public String likePost(@PathVariable("postId") String id) {
		tempPostId = Integer.valueOf(id);
		System.out.println(id + " ");

		return "redirect:/post/choose-user";
	}

	@GetMapping("/choose-user")
	public String chooseUser(Model model) {
		model.addAttribute("usersList", userService.findAllUsers());
		return "post/choose-user";
	}

	@GetMapping("/chose-user/user/{userId}")
	public String saveLikedPost(@PathVariable("userId") String id) {
		tempUserId = Integer.valueOf(id);
		System.out.println(id + " ");
		User user = userService.findUserById(tempUserId);
		user.addLikedPost(postService.findPostById(tempPostId));
		userService.saveUser(user);
		return "redirect:/";
	}

	@GetMapping("/posts/delete/{postId}")
	public String deletePost(@PathVariable("postId") String id) {
		postService.deletePostById(Integer.valueOf(id));
		return "redirect:/post/posts";
	}

}
