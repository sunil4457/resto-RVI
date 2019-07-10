package com.foody.resto.RVI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.foody.resto.RVI.model.Users;
import com.foody.resto.RVI.service.UsersService;
@Controller
public class AdminApiController {
	@Autowired
	private UsersService usersService;
	@RequestMapping(value="/")
	public String login() {
		
		return "login";
	}
	
	
	
	@RequestMapping(value="/api/login")
	@ResponseBody
	public Users saveUser(@RequestParam("username") String userName, @RequestParam("password") String passWord) {
		Users user = new Users();
		user.setUserName(userName);
		user.setPassWord(passWord);
		usersService.save(user);
		return user;
	}
	
}
