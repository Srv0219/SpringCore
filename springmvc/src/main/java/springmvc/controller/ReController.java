package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("One handeller");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("http://youtube.com");
		return redirectView;
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("two handeller");
		return "contact";
	}
}
