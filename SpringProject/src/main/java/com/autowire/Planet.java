package com.autowire;

import org.springframework.context.annotation.Bean;

public class Planet {//cat class

	String Name;
	int addd;
	@Bean
	public int getAddd() {
		return addd;
	}
	public void setAddd(int addd) {
		this.addd = addd;
	}
	Gravity gt;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Gravity getGt() {
		return gt;
	}
	public void setGt(Gravity gt) {
		this.gt = gt;
	}

	
}
