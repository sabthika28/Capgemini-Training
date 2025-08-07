package oops_training;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,25,15,8,9,20};
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int result = Arrays.binarySearch(arr, 15);
		System.out.println("Result = " +result);
	}

}
