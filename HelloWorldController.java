package webapp.one.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	
	//controller to show the form to user

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		
		
		
	}
	
	
	//need controller to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		
		
		 return "helloworld";
		
		
	}
	
	
	
}
