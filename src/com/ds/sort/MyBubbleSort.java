package com.ds.sort;
public class MyBubbleSort {
	public static void bubble_srt(int array[]) {
		for (int m = 0; m < array.length; m++) {
			for (int i = array.length - 1; i > m; i--) {
				printNumbers(array);
				if (array[i - 1] > array[i]) {
					swapNumbers(i - 1, i, array);
				}
			}
		}
	}

	private static void swapNumbers(int i, int j, int[] array) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void printNumbers(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubble_srt(input);
	}
}