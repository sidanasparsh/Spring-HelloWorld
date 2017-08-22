package com.cmpe275.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Main class to create the application context object and an instance of greeting class.
 * Displays the output on the console.
 * @author Sparsh Sidana
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/cmpe275/helloworld/beans.xml");
		Greeting greeting=(Greeting) context.getBean("greeter");
		System.out.println(greeting.getGreeting());
		((ClassPathXmlApplicationContext) context).close();
	}

}
