package com.example.main.FormBean;

import org.springframework.stereotype.Component;

@Component
public class Child {
private String name;
private int pass;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPass() {
	return pass;
}

public void setPass(int pass) {
	this.pass = pass;
}}
