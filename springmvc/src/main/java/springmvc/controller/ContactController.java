package springmvc.controller;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonText(Model model) {
		model.addAttribute("Header", "Registration Form");
		model.addAttribute("Paragraph", "Fill Form");
	}

	@RequestMapping("/contact")
	public String showForm(Model model) {

		System.out.println("This is contact form");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		if (user.getEmail().isBlank() || user.getPassword().isBlank() || user.getUsername().isBlank()) {
			model.addAttribute("emptyfield", "*one or more fields are empty");
			System.out.println("field is empty");
			return "redirect:/contact";
		}

		this.userService.createUser(user);
		// model.addAttribute("user", user);
		return "success";
	}

}

/*
 * @RequestMapping(path="/processform" ,method=RequestMethod.POST ) public
 * String handleForm(HttpServletRequest request) {
 * 
 * String email =request.getParameter("email"); String name
 * =request.getParameter("username"); String pass
 * =request.getParameter("password");
 * 
 * 
 * System.out.println("This is to get data from contact form");
 * System.out.println(email+" "+name+" "+pass); return ""; }
 */

/*
 * @RequestMapping(path="/processform" ,method=RequestMethod.POST ) public
 * String handleForm(
 * 
 * @RequestParam("email") String email,
 * 
 * @RequestParam("username") String name,
 * 
 * @RequestParam("password") String pass,Model model) {
 * 
 * User user = new User(); user.setEmail(email); user.setUsername(name);
 * user.setPassword(pass);
 * 
 * 
 * model.addAttribute("email",email); model.addAttribute("name",name);
 * model.addAttribute("pass",pass);
 * 
 * 
 * model.addAttribute("user", user); return "success"; }
 */
