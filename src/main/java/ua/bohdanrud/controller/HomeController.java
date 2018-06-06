package ua.bohdanrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/show-user-home")
	public String showUserHome() {
		return "user/user-home";
	}

	@GetMapping("/show-post-home")
	public String showPostHome() {
		return "post/post-home";
	}

}
