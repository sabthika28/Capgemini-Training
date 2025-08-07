package oops_training;

import java.util.Arrays;

public class array_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src = {10, 5, 8, 9, 48};
		
		Arrays.sort(src); //sort(Object[])
		
		for(int i : src) {
			System.out.print(i + " ");
		}
		System.out.println();
		String[] names = {"Sabthi", "Vijai","Rishika"};
		Arrays.sort(names);
		for(String s : names) {
			System.out.print(s + " ");
		}
	}

}
