package misl.spring.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import misl.spring.model.JsonResponseModel;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		
		ModelAndView modelAndView = new ModelAndView("home");
		try {
			
			return modelAndView;
		} catch (Exception e) {
			
		}
		return modelAndView;
	}
	@RequestMapping(value = "/usecase", method = RequestMethod.GET)
	public ModelAndView usecase(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		
		ModelAndView modelAndView = new ModelAndView("usecase");
		try {
			
			return modelAndView;
		} catch (Exception e) {
			
		}
		return modelAndView;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		
		ModelAndView modelAndView = new ModelAndView("login");
		try {
			
			return modelAndView;
		} catch (Exception e) {
			
		}
		return modelAndView;
	}
	@RequestMapping(value = "/login_member", method = RequestMethod.GET)
	public ModelAndView login_member(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		
		ModelAndView modelAndView = new ModelAndView("login_member");
		try {
			
			return modelAndView;
		} catch (Exception e) {
			
		}
		return modelAndView;
	}
	@RequestMapping(value = "/login_user", method = RequestMethod.GET)
	public ModelAndView login_user(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		
		ModelAndView modelAndView = new ModelAndView("login_user");
		try {
			
			return modelAndView;
		} catch (Exception e) {
			
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		
		ModelAndView modelAndView = new ModelAndView("register");
		try {
			
			return modelAndView;
		} catch (Exception e) {
			
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/New", method = RequestMethod.GET)
	public ModelAndView New(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		
		ModelAndView modelAndView = new ModelAndView("New");
		try {
			
			return modelAndView;
		} catch (Exception e) {
			
		}
		return modelAndView;
	}
	@RequestMapping(value = "/add_register", method = RequestMethod.POST)
	@ResponseBody
	public JsonResponseModel add_register(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		
		JsonResponseModel modelAndView = new JsonResponseModel();
		try {
			
			String email = request.getParameter("exampleInputEmail1");
			String pass = request.getParameter("exampleInputPassword1");
			String Cpass = request.getParameter("exampleInputPassword2");
			
			System.out.println(email+"///"+pass+"////"+Cpass);
			
			modelAndView.setResult("Success");
			modelAndView.setStatus("200");
			return modelAndView;
		} catch (Exception e) {
			
		}
		return modelAndView;
	}
	

}
