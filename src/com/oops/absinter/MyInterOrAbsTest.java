package com.oops.absinter;

import java.util.ArrayList;
import java.util.List;

public class MyInterOrAbsTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		
		System.out.println("My string is :- "+list.toString().replaceAll("[\\[\\]]", "'").replaceAll(", ", "', '"));
		
		
		interfaceTest interfaceTest=new interfaceTest();
		interfaceTest.printAbstract();
		interfaceTest.test();
		interfaceTest.printDefualtMethod("sdadad");
		interfaceTest.childCallStatic();
		System.out.println("\n");
		MyInterface.printStaticMethod("dasdd");
		abstractTest abstractTest=new abstractTest(10);
		abstractTest.test1();
		abstractTest.printAbstract();
		System.out.println("My test called override child in abtract class." +abstractTest.staticCount);
	}
}
