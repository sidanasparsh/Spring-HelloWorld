package com.cmpe275.helloworld;

/**
 *Class Greeting that implements Greeter interface.
 *name: member variable that has the name of the author.
 * @author Sparsh Sidana
 */
public class Greeting implements Greeter{
	private String name;
	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getGreeting() {
		return ("Hello world from "+name + "!");
	}
	
}
