package com.oops.absinter;

public abstract class MyAbstract {

	public MyAbstract() {
		System.out.println("My Contracter called.");
	}
	
	public void printAbstract() {
		System.out.println("My printAbstract called.");
	}
	
	abstract void test1();
	
	abstract void test2();
}
