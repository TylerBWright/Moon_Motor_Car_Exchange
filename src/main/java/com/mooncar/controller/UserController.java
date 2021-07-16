package com.mooncar.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mooncar.entity.User;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	CarService carService;

	@GetMapping("/")
	public ModelAndView welcome(Model model, HttpSession session) {
		User loginUser = (User) session.getAttribute("loginUser");
		if (loginUser != null && loginUser.getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("admin", "users", userService.users);
		}
		if (loginUser != null && !loginUser.getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("home", "users", userService.users);
		}
		return new ModelAndView("index", "user", new User());
	}
	
	@GetMapping("/home")
	public ModelAndView home(Model model, HttpSession session) {
		if (session.getAttribute("loginUser") == null) {
			return new ModelAndView("index");
		}
		return new ModelAndView("home", "user", new User());
	}

	@GetMapping("/admin")
	public String admin(Model model, HttpSession session) {
		session.getAttribute("loginUser");
		model.addAttribute("updatedUser", new User());
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			return "admin";
		}
		return "redirect:home";
	}
	
	@GetMapping("/login")
	public ModelAndView login(Model model) {
		return new ModelAndView("login", "user", new User());

	}
	
	@PostMapping("/login")
	public String handleLogin(Model model, @ModelAttribute("user") User user, HttpSession session) {
		User loginUser = userService.login(user);
		if (loginUser == null) {
			model.addAttribute("error", "Email/Password Combination Invalid");
			return "login";
		}
		if (loginUser.getEmail().equals("admin@mooncarexchange.com")) {
			session.setAttribute("loginUser", loginUser);
			return "admin";
		}
		session.setAttribute("loginUser", loginUser);
		return "home";

	}

	@GetMapping("/connect")
	public ModelAndView connect(Model model, HttpSession session) {
		if (session.getAttribute("loginUser") == null) {
			return new ModelAndView("index");
		}
		return new ModelAndView("connect", "users", userService.users);
	}
	
	@GetMapping("/profile")
	public ModelAndView profile(Model model, HttpSession session) {
		if (session.getAttribute("loginUser") == null) {
			return new ModelAndView("index");
		}
		session.getAttribute("loginUser");
		model.addAttribute("updatedUser", new User());
		return new ModelAndView("profile", "users", userService.users);
	}
	
	@PostMapping("/editmemberprofile")
	public String editMemberProfile(Model model, @ModelAttribute("updatedUser") User updatedUser, HttpSession session) {
		User verifyUser = (User) session.getAttribute("loginUser");
		userService.updateUser(updatedUser);
		if (verifyUser.getEmail().equals(updatedUser.getEmail())) {
			model.addAttribute("updatedUser", updatedUser);
			model.addAttribute("updatedUser", verifyUser);
			session.setAttribute("updatedUser", verifyUser);
			session.setAttribute("loginUser", updatedUser);
			return "home";
		}
		return "home";
	}

	@GetMapping("/adminprofile")
	public String adminProfile(Model model, HttpSession session) {
		session.getAttribute("loginUser");
		model.addAttribute("updatedUser", new User());
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			return "adminprofile";
		}
		return "redirect:home";
	}
	
	@PostMapping("/editadminprofile")
	public String editAdminProfile(Model model, @ModelAttribute("updatedUser") User updatedUser, HttpSession session) {
		User verifyUser = (User) session.getAttribute("loginUser");
		userService.updateUser(updatedUser);
		if (verifyUser.getEmail().equals(updatedUser.getEmail())) {
			model.addAttribute("updatedUser", updatedUser);
			model.addAttribute("updatedUser", verifyUser);
			session.setAttribute("updatedUser", verifyUser);
			session.setAttribute("loginUser", updatedUser);
			return "admin";
		}
		return "admin";
	}
	
	@PostMapping("/deleteprofile")
	public String handleRemoveProfile(Model model, HttpSession session) {
		User user = (User) session.getAttribute("loginUser");
		userService.removeUser(user.getEmail());
		session.removeAttribute("loginUser");
		return "index";

	}
	
	@GetMapping("/adminconnect")
	public ModelAndView adminconnect(Model model, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("adminconnect", "users", userService.users);
		}
		return new ModelAndView("home", "users", userService.users);
	}
	
	@GetMapping("/logout")
	public String logout(Model model, HttpSession session) {
		session.removeAttribute("loginUser");
		return "index";

	}
	
	@PostMapping("/adminconnect")
	public ModelAndView handleAdminConnect(Model model, @RequestParam String email, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			userService.removeUser(email);
			model.addAttribute("success", "User removed from the network.");
			return new ModelAndView("adminconnect", "users", userService.users);
		}
		return new ModelAndView("home", "users", userService.users);
	}

	@GetMapping("/register")
	public ModelAndView signUp(Model model, HttpSession session) {
		User loginUser = (User) session.getAttribute("loginUser");
		if (loginUser != null && loginUser.getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("admin", "users", userService.users);
		}
		if (loginUser != null && !loginUser.getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("home", "users", userService.users);
		}
		model.addAttribute("verifyUser", new User());
		return new ModelAndView("register", "user", new User());
	}
	
	@PostMapping("/register")
	public String handleSignUp(Model model, @ModelAttribute("user") User user, HttpSession session) {
		userService.verifyAvailableUser(user);
		if (userService.verifyAvailableUser(user)) {
			userService.saveUser(user);
			model.addAttribute("newUser", user);
			session.setAttribute("loginUser", user);
			return "thank-you";
		}
		model.addAttribute("taken", "An account using this email already exists. Please try again.");
		return "register";
	}
	
	@GetMapping("/thank-you")
	public ModelAndView thankyou(Model model, HttpSession session) {
		User loginUser = (User) session.getAttribute("loginUser");
		if (loginUser != null && loginUser.getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("admin", "users", userService.users);
		}
		if (loginUser != null && !loginUser.getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("home", "users", userService.users);
		}
		return new ModelAndView("thank-you", "user", new User());
	}
	
	
	
}
