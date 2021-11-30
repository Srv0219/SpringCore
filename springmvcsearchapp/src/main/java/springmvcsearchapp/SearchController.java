package springmvcsearchapp;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	@RequestMapping("/user/{id}")
	public String getUserDetail(@PathVariable("id") int id) {
		System.out.println(id);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		System.out.println("going to home view");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		RedirectView redirectView = new RedirectView();

		String url = "https://www.google.com/search?q=" + query;
		redirectView.setUrl(url);

		return redirectView;
	}
	
	//Handling exception 

	/*
	 * @ExceptionHandler({ NullPointerException.class, NumberFormatException.class
	 * }) public String exceptionHandlerNull() { return "null_page"; }
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value =NumberFormatException.class ) public String
	 * exceptionHandlerNumberFormat(Model m) {
	 * m.addAttribute("error","Exception has occur"); return "null_page"; }
	 * 
	 * @ExceptionHandler(value=Exception.class) public String
	 * exceptionHandlerGeneric(Model m) {
	 * m.addAttribute("error","Exception has occur"); return "null_page"; }
	 */

}
