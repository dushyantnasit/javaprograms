package com.oops.absinter;

public class abstractTest extends MyAbstract{
	
	static int staticCount=1; 
	
	public abstractTest(Integer a) {
		System.out.println(a);
	}
	
	@Override
	void test1() {
		staticCount++;
		System.out.println("My test called override child in abtract class.");
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
	}
}
