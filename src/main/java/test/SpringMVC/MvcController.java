package test.SpringMVC;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class MvcController {
	
	@RequestMapping("/test")
	public String test(){
		
		return "test";
	}
	@RequestMapping("/date") 
	public String date(Date date){ 
		System.out.println(date); 
		return "test"; 
	} 
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("initBinder");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
}
