package com.logical;
public class MyArmstrongNumber {
	
	public boolean IsArms(int num) {
		int temp=num;
		int rev=0,sum=0;
		while(num !=0) {
			rev=num%10;
			sum+=(rev*rev*rev);
			num=num/10;
		}
		if(sum == temp)
			return true;
		else
			return false;
	}

	public static void main(String a[]) {
		MyArmstrongNumber man = new MyArmstrongNumber();
		System.out.println("Is 371 Armstrong number? " + man.IsArms(371));
		System.out.println("Is 523 Armstrong number? " + man.IsArms(523));
		System.out.println("Is 153 Armstrong number? " + man.IsArms(153));
	}
}