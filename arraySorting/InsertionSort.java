package arraySorting;

public class InsertionSort {

	public static void main(String[] args) {
	
		int arr[]= {93,48,28,58,29,59,58};
		insertionSort(arr);
		print(arr);
		
	}
	public static void insertionSort(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]= arr[j];
				j= j-1;
			}
			arr[j+1]=key;
		}
	}
	public static void print(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
