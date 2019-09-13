package com.example.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.FormBean.Child;
import com.example.main.FormBean.Employee;

@RestController
public class MainController {
	
	@Autowired
	Employee emp;
	
	@RequestMapping(value="/verify", method=RequestMethod.GET)
	public String verifyController() {
		return "controller verified";
	}
	
	@PostMapping("/verify/{name}")
	
	public List<Child>  postExample(@PathVariable("name") String name,@RequestBody Employee emp)
	{
		
		List<Child> obj=emp.getAbd();
		return obj;
		
	}
	

}
