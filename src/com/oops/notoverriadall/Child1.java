package com.oops.notoverriadall;
public class Child1 extends Abstract{
	
	
	@Override
	public int speed() {
		System.out.println("New default method" + " is added in interface");
		return 0;
	}
	

	public static void main(String[] args) {
		Abstract a=new Child1();
		a.speed();
		a.brack();
	}
}