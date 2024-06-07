package arraySorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {98,54,74,36,84,37,21,12};
		
		bubbleSort(arr);
		printArray(arr);
	}
	
	public static void bubbleSort(int arr[])
	{
		for (int i = 0; i < arr.length-1; i++) {
			boolean swap = false;
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap=true;
				}	
			}
			if (swap==false) {
			}
			break;
		}
	}
	
	public static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
