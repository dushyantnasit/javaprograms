package com.misc;

class BitWiseOprater {
    public static void main(String args[])  {
       int x = -4;
       System.out.println(x>>1);
       System.out.println(x<<1);
       int y = 4;
       System.out.println(y>>1);
       System.out.println(y<<1);
       
       // x is stored using 32 bit 2's complement form. 
       // Binary representation of -1 is all 1s (111..1)       
       int X = -1;  
 
       System.out.println(X>>>29);  // The value of 'x>>>29' is 00...0111
       System.out.println(X>>>30);   // The value of 'x>>>30' is 00...0011 
       System.out.println(X>>>31);  // The value of 'x>>>31' is 00...0001 
    }    
}