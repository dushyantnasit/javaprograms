package com.oops.twist;

class Aninal{}
class HumanType extends Aninal{} 
class Monkey extends HumanType{}

class Parent{
	Parent m1(Aninal ani){
		System.out.println("\n Parent Animal");
		return null;
	}
	
	Parent m1(HumanType hum){
		System.out.println("\n Parent HumanType");
		return null;
	}
}

class Child extends Parent{
	
	Parent m1(Monkey hum){
		System.out.println("\n Child Monkey");
		return null;
	}
}

public class TellMeThisOverlodingOrOverriading {
	public static void main(String[] args) {
		Parent pobj = new Child();
		pobj.m1(new  Monkey());
	}
}