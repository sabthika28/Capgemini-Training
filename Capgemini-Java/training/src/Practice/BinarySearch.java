package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] arr, int key) {
		int low = 0, high = arr.length - 1;
		
		while(low <= high) {
			int mid = (low + high)/2;
			
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid] < key){
				low = mid + 1;
			}else {
				high = mid - 1;
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
		for(int i = 0; i < n; i ++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Sorted array : "+Arrays.toString(arr));
		System.out.println();
		
		System.out.print("Enter the element to search : ");
		int key = s.nextInt();
		
		int result = binarySearch(arr,key);
		
		if(result == -1) {
			System.out.println("The element not found in the array");
		}
		else {
			System.out.println("The element found at index "+result);
		}
		
		
		

	}

}
