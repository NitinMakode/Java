/*we have given a array of 0s and 1s ,you have to shift all the 0s to
 *  left side of the array and 1s to right side of the array */
package problemSolving;

public class ProblemStatement1 {
	public static void main(String[] args) {
		int arr[] = { 1,0,1,1,1,1,0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0};
		sortArray(arr);
		for (int j = 0; j < arr.length; j++) {
		System.out.print(arr[j]);	
		}
	}

	public static int[] sortArray(int arr[]) {
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]!=0) {
			swap(arr, i);
		}
	}
	return	arr;
	}

	public static int[] swap(int arr[],int i) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[j]== 0) {
				int a = arr[j];
				arr[j]= arr[i];
				arr[i]= a;
				}
		}
		return arr;
	}
}
