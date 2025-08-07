package Practice;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int[]arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = s.nextInt();
		int[] arr = new int[n];
		
		System.out.print("Enter the elements : ");
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.print("Enter the key element : ");
		int key = s.nextInt();
		
		int result = linearSearch(arr, key);
		
		if(result == -1) {
			System.out.println("The element is not found in the array");
		}else {
			System.out.println("The element found at index "+result);
		}

	}

}
