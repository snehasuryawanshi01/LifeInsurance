package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ClientDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Client;
import com.example.demo.entity.User;

@RestController
public class UserController {

	@Autowired
	private UserDao dao;

	@Autowired
	private ClientDao cdao;

	@GetMapping("/welcome")
	public ModelAndView homepage() {
		ModelAndView m = new ModelAndView("Welcome.jsp");
		return m;
	}

	@GetMapping("/getallusers")
	public ModelAndView getAllUser() {
		ModelAndView m = new ModelAndView("getall.jsp");
		List<Client> cusers = cdao.findAll();
		m.addObject("list", cusers);
		return m;
	}

	@RequestMapping("/verifyuser")
	public ModelAndView userlogin(String username, String password, HttpSession httpSession, HttpServletRequest req,
			HttpServletResponse res) {
		System.out.println(username);
		System.out.println(password);
		User u = dao.findByemailUserandpasswordUser(username, password);
		if (u != null)

		{
			ModelAndView m = new ModelAndView("ClientList.jsp");
			// List<client> clientuser=ClientDao.findAll();
			return m;
		}

		else {
			ModelAndView mv = new ModelAndView("error.jsp");
			return mv;

		}

	}

	@PostMapping("/registeruser")
	public ModelAndView registerlogin(String username, String password, String email) {
		ModelAndView m = new ModelAndView("Welcome.jsp");
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);

		User user = new User(username, email, password);
		dao.save(user);
		return m;
	}

	/*@PostMapping("/registerclient")
	public ModelAndView registerclient(String cname)
	{
		ModelAndView m =new ModelAndView("ClientList.jsp");
		System.out.println(cname);		
		Client client = new Client(cname);
		cdao.save(client);
		return m;
	}*/

}
