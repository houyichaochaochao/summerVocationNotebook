package com.test.bookshop.web.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.InputStream;

// 声明当前类是一个控制器类
@Controller
public class MyController {
	
	// 控制方法 - 普通方法
	// 借助注解 - 声明该控制方法的访问方式&url
	@GetMapping("/index")
	public ModelAndView test(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:index.jsp");	// 设置视图名为指定转向跳转的 jsp 页面
		return mv;
	}
//	public String test() {
////		return "abc";			// 逻辑视图名
//		return "redirect:rootabc.jsp";		// 转向跳转到 jsp 页面
//	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(String usn, MultipartFile file, HttpServletRequest request) throws Exception{
		System.out.println(usn);
		String contentType = file.getContentType();
		String name = file.getName();
		String oname = file.getOriginalFilename();
		long size = file.getSize();
		//InputStream is = file.getInputStream();
//		String filename = MyController.class.getClassLoader()+System.currentTimeMillis() + ".jpg";
		String path = request.getServletContext().getRealPath("/");
//		FileUtils.copyInputStreamToFile(file.getInputStream(), new File(filename));
		return "";

	}

}
