package springmvcsearchapp;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		return "Complex";
	}

	/*
	 * @RequestMapping(path="/handleform",method = RequestMethod.POST) public String
	 * formHandler(
	 * 
	 * @RequestParam("fname") String fname,
	 * 
	 * @RequestParam("lname") String lname,
	 * 
	 * @RequestParam("uname") String uname,
	 * 
	 * @RequestParam("city") String city,
	 * 
	 * @RequestParam("state") String state,
	 * 
	 * @RequestParam("zip") int zip ) {
	 * 
	 * System.out.println(fname); System.out.println(lname);
	 * System.out.println(uname);
	 * 
	 * return "success"; }
	 */
	
	@RequestMapping(path="/handleform",method = RequestMethod.POST)
	public String formHandler(
			@ModelAttribute("student") Student student,BindingResult result) {
		if (result.hasErrors()){
			return "success";
		}
		
		System.out.println(student);
	
		
		return "success";
	}

}
