package com.logical;
public class NextPrime{

    public int nextPrime(int input){
          int counter=0;
            for(int i = 2; i <= input/2; i ++){
              if(input % i == 0)  
                counter++;
            }
            System.out.println("Count :-"+counter +" Num :- " +input);
            if(counter == 0)
              return input;
            else{
              return nextPrime(++input);
            }
        }
    
     public static void main(String []args){
        System.out.println("Hello World");
        NextPrime hw=new NextPrime();
         System.out.println(hw.nextPrime(9));
     }
}