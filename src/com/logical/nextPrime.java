package com.logical;

public class nextPrime {

	public static void main(String[] args) {
		int no=100;
		int lenght=500;
		System.out.println("Next Prime number is :- "+nextPrime(no,lenght));
	}
	
	public static int nextPrime(int no,int len) {
		int count=0;
		for(int i=2; i < len;i++) {
			if(i%2!=0) {
				if(no<i) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Loop Find next prime is :- "+i);
				return i;
			}
		}
		return 0;
	}

}
