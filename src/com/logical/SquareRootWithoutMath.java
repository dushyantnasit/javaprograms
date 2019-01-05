package com.logical;
public class SquareRootWithoutMath {
	
	public static double sqrt(int number) {
		double t;
		double square=number/2;
		do {
			t=square;
			square=(t+(number/t))/2;
		}while((t-square)!= 0);
		return square;
	}
	
	public static void main(String[] args) {
		System.out.println(sqrt(25));
	}
}