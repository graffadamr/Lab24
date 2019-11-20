package co.grandcircus.Lab24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	ProductDao dao;
	
	@Autowired
	UsersDao dao2;

	@RequestMapping("/")
	public ModelAndView home() {
		System.out.println(dao.findAllProducts());
		return new ModelAndView("index", "productList", dao.findAllProducts());
	}
	

	@RequestMapping("register")
	public String register() {
		System.out.println("BACON!!!!!!!!!!!!!!!");
		return "register";
	}
	
//	@RequestMapping("complete-page")
//	public String registerPage() {
//		return "complete-page";
//	}
	
	@RequestMapping("complete-page")
	public ModelAndView updateUsers(Users users) {
		System.out.println("BACON");
		System.out.println(users);
		dao2.updateUsers(users);
		System.out.println("bacon");
		return new ModelAndView("complete-page");
		
	}
	
	

}
