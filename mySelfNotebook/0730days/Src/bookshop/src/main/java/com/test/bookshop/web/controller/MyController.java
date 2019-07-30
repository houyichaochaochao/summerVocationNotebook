package com.test.bookshop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 声明当前类是一个控制器类
@Controller
public class MyController {
	
	// 控制方法 - 普通方法
	// 借助注解 - 声明该控制方法的访问方式&url
	@GetMapping("/index")
	public String test() {
		return "abc";			// 逻辑视图名
	}
	

}
