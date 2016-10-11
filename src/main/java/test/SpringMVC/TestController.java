package test.SpringMVC;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/hello")
	public String hello(Date date){
		
		System.out.println(date);
		
		return "hello";
		
	}
}
