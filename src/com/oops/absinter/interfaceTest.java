package com.oops.absinter;

public class interfaceTest implements MyInterface{

	@Override
	public void printAbstract() {
		System.out.println("My printAbstract override child class called.");
		
	}

	@Override
	public void test() {
		System.out.println("My test called override child class.");
	}

	public void childCallStatic() {
		MyInterface.printStaticMethod("dasdd");
		System.out.println("My Statuc interface method called override child class.");
	}
}
