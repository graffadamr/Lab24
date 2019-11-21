package co.grandcircus.Lab24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	ProductRepo pr;
	
	@Autowired
	UsersRepo ur;

	@RequestMapping("/")
	public ModelAndView home() {
		System.out.println(pr.findAll());
		return new ModelAndView("index", "productList", pr.findAll());
	}
	

	@RequestMapping("register")
	public String register() {
		return "register";
	}
	
	
	@RequestMapping("complete-page")
	public ModelAndView updateUsers(Users users) {
		System.out.println(users);
		ur.save(users);
		return new ModelAndView("complete-page");
		
	}
	
	

}
