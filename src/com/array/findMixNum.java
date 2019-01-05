package com.array;

public class findMixNum {

	public static void main(String[] args) {
		int array[]= {15,25,14,10,60,45,50};
		
		int max=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i] < min) {
				min=array[i];
			}
		}
		System.out.println("Array is maximum number is :- "+max);
		System.out.println("Array is Minimum number is :- "+min);
	}

}
