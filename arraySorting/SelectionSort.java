package arraySorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {78,37,74,36,13,44,23};
		selectionSort(arr);
		printArray(arr);
	}
	
	public static void selectionSort(int arr[])
	{
		for (int i = 0; i < arr.length-1; i++) {
			int min_pos = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]<arr[min_pos]) {
					min_pos= j;
				}
			}
			int temp = arr[min_pos];
			arr[min_pos] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
