package com.scp.Spring_desktop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
	
		
	/*
		Lookup l1=(Lookup) context.getBean("lookid");
		
		Vender v1=l1.createNewVendor();
		Vender v2=l1.createNewVendor();
		
		System.out.println(v1==v2);
		*/
		
		Product product1 = (Product)context.getBean("Pid");//100
		Vender v1=product1.createNewVendor();
		Vender v2=product1.createNewVendor();
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1==v2);//expected false since we used lookup
		
		
		
		
		
		
		
	}

}
