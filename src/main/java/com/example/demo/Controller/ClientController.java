package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ClientDao;
import com.example.demo.entity.Client;

@RestController
public class ClientController {
	
	@Autowired private ClientDao cdao;
	
	@PostMapping("/registerclient")
	public ModelAndView registerclient(String cname)
	{
		ModelAndView m =new ModelAndView("ClientList.jsp");
		System.out.println(cname);		
		Client client = new Client(cname);
		cdao.save(client);
		return m;
	}
	
	
}