package com.logical;
public class SortWithoutSecArray{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] array={10,25,30,45,50,55};
        int temp=0;
        int mix=array.length-1;
        for(int i=0;i<array.length/2;i++){
            temp=array[i];
            array[i]=array[mix];
            array[mix--]=temp;
        }
        
        for(int i=0;i<array.length;i++){
            System.out.println("i "+array[i]);
        }
     }
}