package springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path ="/first")
public class HomeController {
    
	//Model
	@RequestMapping(path ="/home" , method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Sourav Adak");
		ArrayList<String> al = new ArrayList();
		al.add("Adhish");
		al.add("Sagar");
		model.addAttribute("Friends", al);
		return "index";
	}
	
	//ModelAndView
	@RequestMapping(path ="/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		ModelAndView andView = new ModelAndView();
		andView.addObject("name","Jharna Adak");
		ArrayList<Integer> al = new ArrayList();
		al.add(10223);
		al.add(26765);
		al.add(38907);
		andView.addObject("roll",al);
		andView.setViewName("help");
		return andView;
	}
}
