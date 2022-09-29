package com.autowire;
//Autowire example 
/*
 * Auto wiring can be happen in different ways :-
 * byName
 * byType
 * byConstructor
 * /
 */

import org.springframework.beans.factory.annotation.Autowired;

public class Gravity {//color class
	int gt;

	public int getGt() {
		return gt;
	}

	public void setGt(int gt) {
		this.gt = gt;
	}
	
}
