package com.ds.search;
public class MyRecursiveBinarySearch {
	public static int count=1;
    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
    	System.out.println(" Count "+count++);
        if (start <= end) {
        	int mid = (start + end) / 2;
            if (key == sortedArray[mid]) {
                return mid;
            }
            if (key < sortedArray[mid]) {
            	return recursiveBinarySearch(sortedArray, start, mid-1, key);
            } else {
            	return recursiveBinarySearch(sortedArray, mid+1, end , key);
            }
        }
        return -1;  
    }
 
    public static void main(String[] args) {
        int[] arr1 = {2,45,50,55,60,75,80,85,90,95,99,100,110,234,567,876,900,976,999,1000,1500,2000,2500,3000};
        
        int index = recursiveBinarySearch(arr1,0,arr1.length,85);
        System.out.println("Found 85 at "+index+" index");
    }
}