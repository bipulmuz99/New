package com.example.main.FormBean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	List<Child> abd=new ArrayList<Child>();

	public List<Child> getAbd() {
		return abd;
	}

	public void setAbd(List<Child> abd) {
		this.abd = abd;
	}
	
	
	

}
