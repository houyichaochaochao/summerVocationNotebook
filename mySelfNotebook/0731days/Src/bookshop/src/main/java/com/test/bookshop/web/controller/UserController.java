package com.test.bookshop.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.bookshop.biz.UserService;
import com.test.bookshop.biz.impl.UserServiceImpl;
import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.test.bookshop.domain.po.User;
// 声明放入 session 中的数据的信息(key的值，value的类型)
@SessionAttributes(value = {"usn", "pwd"}, types = {User.class})
@Controller
public class UserController {
//	private UserService userService = new UserServiceImpl();
	@Autowired
	private UserService userService;

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String toLogin() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView doLogin(User user, /* Map<String, Object> map,*/ ModelMap map, Model model) {
		ModelAndView mv = new ModelAndView();
		// 1 - 获取数据
		System.out.println(user);
		// 2 - 调用业务逻辑层的方法
		// 模拟实现
//		if ( user.getUsn().equals(user.getPwd()) ) {
		if (userService.isValidate(user.getUsn(), user.getPwd())){
//			mv.setViewName("success");
//			Map<String, Object> data = new HashMap<String, Object>();
//			data.put("username", user.getUsn());
//			data.put("salary", user.getSalary());
//			mv.addAllObjects(data);
			// 带着用户的信息（放在 session 中）
			map.put("usn", user.getUsn());
			map.put("pwd", user.getPwd());
			model.addAttribute("user",user);
//			mv.addObject("user", user);
			mv.setViewName("redirect:/getAllBooks");
		}else {
			mv.setViewName("login");	// 转发到 login.jsp 页面
//
//			mv.setViewName("forward:/register");  // 转向跳转到 /register 控制器
		}
		return mv;
	}

	// 跳转到注册页面
	@GetMapping("/register")
	public String toRegister(){
		return "register";
	}

}
