package test.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class MvcController {
	
	@RequestMapping("/test")
	public String test(){
		
		return "test";
	}
}
