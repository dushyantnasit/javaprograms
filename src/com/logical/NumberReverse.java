package com.logical;
public class NumberReverse {
    
    public int reverseDigit(int number){
        int rev=0;
        while(number != 0){
            rev=(number%10)+(rev*10);
            number=number/10;
        }
        return rev;
    }
     
    public static void main(String a[]){
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.reverseDigit(17868));
    }
}