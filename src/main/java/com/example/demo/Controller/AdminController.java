package com.example.demo.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AdminDao;
import com.example.demo.dao.PolicyDao;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Policy;

@RestController
public class AdminController {
	
	@Autowired
	private AdminDao dao;
	@Autowired
	private PolicyDao pdao;
	
	@RequestMapping("/verifyadmin")
	public ModelAndView userlogin(String adminname,String adpassword,HttpSession httpSession,
			HttpServletRequest req, HttpServletResponse res)
	{
		System.out.println(adminname);
		System.out.println(adpassword);
		Admin u=dao.findByemailUserandpasswordUser(adminname,adpassword);
		if(u != null)		 
		{
			
			ModelAndView m =new ModelAndView("dummy.jsp");
			List<Policy> clients=pdao.findAll();
			m.addObject("list", clients);			
			return m;
		}
		
		else {
			ModelAndView mv = new ModelAndView("error.jsp");
			String aString="Please enter correct credential";
			mv.addObject("err",aString);
			return mv;
			
		}
		
	}


}