package com.ds.sort;
public class MyQuickSort {
     
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    /*{24,2,45,20,56,75,2,56,99,53,12};*/
    /*private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        System.out.println("************** i " +i+" j "+j+" pivot :- "+pivot);
        while (i <= j) {
        	printNumbers();
            System.out.println("First Chack :- array[i] < pivot :- "+array[i] + " < "+ pivot);
        	while (array[i] < pivot) {
            	System.out.println("array[i] < pivot :- "+array[i] + " < "+ pivot  + "  i Index :- "+i);
            	i++;
            }
        	System.out.println("Second Chack :- pivot < array[j] :- "+pivot + " < "+array[j] );
            while (pivot < array[j]) {
            	System.out.println("pivot < array[j] :- "+pivot + " < "+array[i]  + "  j Index :- "+j);
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }*/
 
    private void quickSort(int low, int high) {
    	int i=low;
    	int j=high;
    	int pivot=array[low+(high-low)/2];
    	while(i<=j) {
    		while(array[i]<pivot) {
    			i++;
    		}
    		while(pivot<array[j])
    			j--;
    		if(i<=j) {
    			exchangeNumbers(i, j);
    			i++;
    			j--;
    		}
    	}
    	if(low<j)
    		quickSort(low,j);
    	if(i<high)
    		quickSort(i, high);
    	
    }
    int count=0;
    
    private void printNumbers() {
    	System.out.println("================================================= "+count++);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n");
    }
    
    private void exchangeNumbers(int i, int j) {
    	System.out.println(" Change Num :- "+i + " AND "+j);
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
        MyQuickSort sorter = new MyQuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}