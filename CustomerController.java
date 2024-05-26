package com.example.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.Customer1;
import com.example.daoImpl.CustomerDaoImpl;

@Controller
@ComponentScan("com.example.daoImpl")
public class CustomerController {
public CustomerController() {
}
//	   
	@RequestMapping("/")
public String ShowIndexPage() {
		System.out.println("this is login page");
		return "login";
	}
//	
	@RequestMapping("/addcum")
	public String addCustomer1() {
		System.out.println(" this is add customer");
		return "addCustomer";
	}
	
	
	@Autowired
	CustomerDaoImpl cumd;

	
	@RequestMapping("/validate")
	public  ModelAndView addCustomer(@ModelAttribute Customer1 cum) {
		System.out.println("this is add customer");
		System.out.println(cumd);
		int i=1;
		if(i==1) {
			cumd.addCustomer1(cum);
			ModelAndView mv=new ModelAndView("home");
			mv.addObject("message","Record added sucessfully");
			return mv;
		}
		else {
			ModelAndView mv=new ModelAndView("error");
			mv.addObject("message ","error occured");
			return mv;
		}
	}
//	@RequestMapping("displayAll")
//	public  ModelAndView displayAll(@ModelAttribute Customer cum) {
//		System.out.println("this is display all");
//		ModelAndView mv=new ModelAndView("display all");
//		List <Customer1> list=  cumd.displayAll();
//		mv.addObject("lcum",list);
//		cumd.displayAll();
//		return mv;
//		
//		
	}
//	@RequestMapping("/customers")
//	public String getCustomers() {
//		return cumd.findAll().toString();
//	}

