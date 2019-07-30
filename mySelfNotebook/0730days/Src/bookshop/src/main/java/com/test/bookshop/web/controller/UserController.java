package com.test.bookshop.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.bookshop.domain.po.User;

@Controller
public class UserController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String toLogin() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView doLogin(User user) {
		ModelAndView mv = new ModelAndView();
		// 1 - 获取数据
		System.out.println(user);
		// 2 - 调用业务逻辑层的方法
		// 模拟实现
		if ( user.getUsn().equals(user.getPwd()) ) {
			mv.setViewName("success");
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("username", user.getUsn());
			data.put("salary", user.getSalary());
			mv.addAllObjects(data);
		}else {
			mv.setViewName("login");
		}
		return mv;
	}

}
