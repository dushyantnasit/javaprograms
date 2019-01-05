package com.oops.absinter;

public interface MyInterface {

	default void printDefualtMethod(String str) {
		System.out.println("My Interface test Print method.");
	}
	
	static void printStaticMethod(String str) {
		System.out.println("My Interface test printStaticMethod");
	}
	
	void printAbstract();
	
	void test();
}
