package arraySorting;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortMethod {
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
		arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		Arrays.binarySearch(arr, 5);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
