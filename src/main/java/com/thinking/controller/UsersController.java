package com.thinking.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.thinking.bean.Users;
import com.thinking.service.UsersServiceI;

/**
 * ���� ������ ���ڣ�2017��6��29�� ��˾��ArteonWMS ������Users������
 */

@Controller
public class UsersController {
	@Autowired
	private UsersServiceI usi;

	@RequestMapping("/gologin.do")
	public String login() {
		//ModelAndView mav = new ModelAndView();
		//mav.setViewName("login");// springmvc.xml���Ѿ����������ĺ�׺�����������ֱ��д���û����������Ҫ���Ϻ�׺��
		//return mav;
		return "login";
	}
	@RequestMapping("/showUsers")
	public ModelAndView showUsers() {
		List<Users>list=usi.findAllUsers();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.setViewName("users/showUsers");
		return mav;
	}
	@RequestMapping("/login")
	public String login(Users user) {
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		if (usi.login(user)) {
			return "redirect:showUsers.do";
		//	return "users/showUsers";
		} 
		else{
			return "login";
		}
	}
	@RequestMapping("/addUsers")
	public String addUsers(Users user){
		
	}
	
//	@RequestMapping("/delete")
//	public String delete(String chk){
//		List<Integer>userIdlist= new ArrayList<Integer>();
//		for(Users user:list){
//			userIdlist.add(user.getUserId());
//		}
//		for(Integer i:userIdlist){
//			System.out.println(i);
//		}
//		//usi.deleteByWhere(userIdlist);
//		return "redirect:showUsers.do";
//	}
}
