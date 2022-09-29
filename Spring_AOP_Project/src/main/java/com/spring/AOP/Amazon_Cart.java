package com.spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class Amazon_Cart {
	
	void cart_item_List() {
		
		System.out.println(" \n\n *************This is cart list **************");
		
		System.out.println("*******Womens colthes******"
				+ "\n *******boys shoes *******"
				+ "\n *******Grocery ******* "
				+ "\n *******chocolate *******");
		
	}
	
	void payment() {
		System.out.println(" \n\n **************Payment done Successfully **************"
				+ "\n **************************** Thanks for visiting and shopping from here ***********************************");
	}

}
