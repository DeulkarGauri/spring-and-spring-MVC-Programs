package com.spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class Amazon {

	void item() {
		
		System.out.println(" \n\n *************** This is My Item  List ***************" + "\n Womens Fashoin "
				+ "\n Boys fashoin " + "\n kids" + "\n grocery" + "\n cosmatics" + "\n Other");
	}

	void selectedItemList() {

		System.out.println(" \n\n *************** This is My selectedItemList *************** ");

		System.out.println("*****Chocolates ********" + " \n ******clothes **********" + " \n *****cosmatics*******");
	}
}
