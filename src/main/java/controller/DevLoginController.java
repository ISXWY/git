package controller;

import java.lang.annotation.Repeatable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import pojo.DevUser;
import service.DevUserService;

@Controller
@RequestMapping(value="/dev")
public class DevLoginController {
	
	@Autowired
	private DevUserService service;
	
	@RequestMapping("/login")
	public String login() {
		return "devlogin";
	}
	
	@RequestMapping(value="/dologin",method=RequestMethod.POST)
	public String dologin (@RequestParam String devCode,@RequestParam String devPassword, 
						 HttpServletRequest request,HttpSession session) {
		DevUser user = null;
		if (devCode!=null && devPassword!=null) {
			try {
				user = service.login(devCode, devPassword);
			} catch (Exception e) {
				System.out.println("用户名密码");
				e.printStackTrace();
			}
			if (user!=null) {
				System.out.println("登录成功");
				session.setAttribute("DEV_USER_SESSION", user);
				return "redirect:/dev/flatform/main";
			}else {
				request.setAttribute("error", "用户名密码不正确");
				return "devlogin";
			}
		}else {
			System.out.println("用户名密码没有接受到");
			return "devlogin";
		}
		
	}
	
	@RequestMapping(value="/flatform/main")
	public String main(HttpSession session){
		if(session.getAttribute("DEV_USER_SESSION") == null){
			return "redirect:/dev/login";
		}
		return "developer/main";
	}
	
	@RequestMapping("/loginout")
	public String loginOut(HttpSession session) {
		session.removeAttribute("Dev_user");
		return "devlogin";
	}
}
