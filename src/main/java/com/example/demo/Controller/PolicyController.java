package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.PolicyDao;
import com.example.demo.entity.Policy;
@RestController
public class PolicyController {
	
	@Autowired private PolicyDao pdao;
	
	int PolicyPremium;
	float PolicyPremiumMonth;
	@PostMapping("/createPolicy")
	public ModelAndView registerlogin(String fnm, String lnm, String dob, int age, String email, String mobno, String gender,
			String tpolicy, String tobaco, float income, float coveramt, int coverage) {
		ModelAndView m = new ModelAndView("NewPolicy.jsp");

		Policy policy = new Policy( fnm,  lnm,  dob,  age,  email,  mobno,  gender, 
				tpolicy,  tobaco,  income,  coveramt,  coverage);
			
		pdao.save(policy);
		int ageDiffer =policy.getCoverage()-policy.getAge();
		PolicyPremium = CalculatePremium(policy.getPid());
		TotalPremium(policy.getPid());
		PolicyPremiumMonth=PolicyPremium/12;
		m.addObject("age", ageDiffer);
		m.addObject("Premium",PolicyPremium);
		m.addObject("PremiumMonth",PolicyPremiumMonth);
		return m;
	}
	
	@GetMapping("/payment")
	public ModelAndView payment()
	{
		ModelAndView m = new ModelAndView("payment.jsp");
		//float NewPremium = (PolicyPremiumMonth + 10);
		//System.out.println(NewPremium);
		int payment=PolicyPremium+0;
		System.out.println(payment);
	m.addObject("PolicyPremium",payment);
	
//		//m.setViewName("AccidentalTotal.jsp");
	return m;
	}
	
	@GetMapping("/Accidental")
	public ModelAndView CalculateAcci()
	{
		ModelAndView m = new ModelAndView("Accidentalpremium.jsp");
		float NewPremium = (PolicyPremiumMonth + 10);
		System.out.println(NewPremium);
		m.addObject("NewPremium",NewPremium);
		
		//m.setViewName("AccidentalTotal.jsp");
		return m;
	}
	
	@GetMapping("/Yearly")
	public ModelAndView CalculateYearly()
	{
		ModelAndView m = new ModelAndView("payment.jsp");
		int YearlyPolicyPremium = (int) (PolicyPremium - (PolicyPremium *0.15));
		m.addObject("PolicyPremium",YearlyPolicyPremium);
		
		//m.setViewName("Payment.jsp");
		return m;
	}
	///Monthly
	@GetMapping("/Monthly")
	public ModelAndView CalculateMonthly()
	{
		ModelAndView m = new ModelAndView("payment.jsp");
		int MonthlyPolicyPremium = (int) (PolicyPremiumMonth - (PolicyPremiumMonth *0.02));
		m.addObject("PolicyPremium",MonthlyPolicyPremium);
		
		//m.setViewName("Payment.jsp");
		return m;
	}
	
	
	@GetMapping("/comprehensive")
	public ModelAndView CalculateAccin()
	{
		ModelAndView m = new ModelAndView("comprehensive.jsp");
		float ComprehensivePremium = (PolicyPremiumMonth + 80);
		System.out.println(ComprehensivePremium);
		m.addObject("ComprehensivePremium",ComprehensivePremium);
		
		//m.setViewName("AccidentalTotal.jsp");
		return m;
	}
	
	@GetMapping("/Yealy")
	public ModelAndView CalculateYearlyComprehensive()
	{
		ModelAndView m = new ModelAndView("payment.jsp");
		int YearlyPolicyPremium = (int) (PolicyPremium - (PolicyPremium *0.15));
		m.addObject("PolicyPremium",YearlyPolicyPremium);
		
		//m.setViewName("Payment.jsp");
		return m;
	}
	
	@GetMapping("/Montly")
	public ModelAndView CalculateComprehensive()
	{
		ModelAndView m = new ModelAndView("payment.jsp");
		int MonthlyPolicyPremium = (int) (PolicyPremiumMonth - (PolicyPremiumMonth *0.02));
		m.addObject("PolicyPremium",MonthlyPolicyPremium);
		
		//m.setViewName("Payment.jsp");
		return m;
	}
	
	
	public void TotalPremium(int pid)
	{
		System.out.println("Total"+pid);
		Policy p1 = pdao.findByClientName(pid);
	}
	
	
	//@PostMapping("PaymentMode")
	
	
	public int CalculatePremium(int pid) {
		System.out.println(pid);
		Policy p1 = pdao.findByClientName(pid);
		
		int ageDiffrn=p1.getCoverage()-p1.getAge();
		
		int premium = (int) p1.getCoveramt()/ageDiffrn;
		return premium;		
	}
	
	/*
	 * public ModelAndView ageDifference(int pid) { Policy p1 =
	 * pdao.findByClientName(pid); int ageDiffer =p1.getCoverage()-p1.getAge();
	 * ModelAndView m = new ModelAndView("NewPolicy.jsp");
	 * m.addObject("ageDiffer",ageDiffer); return m; }
	 */


	@GetMapping(value="/{cname}",headers="Accept=application/json")
	public ModelAndView listOfPolicy(@PathVariable String cname) {
		
		//System.out.println(cname);
		ModelAndView m = new ModelAndView("ListOfPolicy.jsp");
	
		List<Policy> plist = (List<Policy>) pdao.ClientList(cname);
		System.out.println(plist);
		m.addObject("key",plist);
		
		return m;
	}
	
	//@RequestMapping(method=RequestMethod.DELETE)
	@RequestMapping("/DeletePolicy/{pid}")
	public ModelAndView DeleteID(@PathVariable int pid)
	{
		ModelAndView m = new ModelAndView("delete.jsp");
		System.out.println("Hello");
		//System.out.println(pid);
		pdao.deleteById(pid);
		//System.out.println(pdao.DeleteByID(pid));
		System.out.println("Deleted successfully");
		//m.setViewName("Welcome.jsp");
		return m;
	}
	
}














