package springmvcsearchapp;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler({ NullPointerException.class, NumberFormatException.class })
	public String exceptionHandlerNull() {
		return "null_page";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value =NumberFormatException.class )
	public String exceptionHandlerNumberFormat(Model m) {
		m.addAttribute("error","Exception has occur");
		return "null_page";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerGeneric(Model m) {
		m.addAttribute("error","Exception has occur");
		return "null_page";
	}
}
