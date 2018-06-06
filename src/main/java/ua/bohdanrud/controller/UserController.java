package ua.bohdanrud.controller;

import java.util.Arrays;

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
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.bohdanrud.entity.User;
import ua.bohdanrud.entity.enums.Country;
import ua.bohdanrud.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes({ "countries" })
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/add-user")
	public String showAddStudent(Model model) {
		model.addAttribute("userModel", new User());
		model.addAttribute("countries",
				Arrays.asList(Country.UKRAINE, Country.USA, Country.POLAND, Country.GERMANY, Country.ANOTHER));
		return "user/add-user";
	}

	@PostMapping("/add-user")
	public String saveStudent(@Valid @ModelAttribute("userModel") User user, BindingResult br) {
		if (br.hasErrors()) {
			return "user/add-user";
		}

		userService.saveUser(user);
		return "redirect:/";
	}

	@GetMapping("/users")
	public String showAllUsers(Model model) {
		model.addAttribute("usersList", userService.findAllUsers());
		return "user/users";
	}

	@GetMapping("/users/delete/{userId}")
	public String deleteUser(@PathVariable("userId") String id) {
		userService.deleteUserById(Integer.valueOf(id));
		return "redirect:/user/users";
	}

}
