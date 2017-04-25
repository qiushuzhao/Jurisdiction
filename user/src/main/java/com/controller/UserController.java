package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.Page;
import com.entity.User;
import com.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/main")
	public String view(){
		return "main";
	}
	
	@RequestMapping("/userList")
	public String userList(User user,Model model){
		Page<User> p=userService.select(user);
		model.addAttribute("page",p);
		return "main";
	}
}
