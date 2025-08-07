package Practice;

import java.util.*;

public class ArrayListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of elements : ");
		int n = s.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>(); // getting elemets
		System.out.print("The "+n+" elements are : ");
		for(int i = 0 ; i < n ; i++) {
			list.add(s.nextInt());
		}
		Set<Integer> set = new HashSet<>(list); // To remove duplicates
		
		ArrayList<Integer> result = new ArrayList<>(set);
		Collections.sort(result);
		System.out.print("Sorted elements without duplicates : ");
		for(int num : result) {
			System.out.print(num + " ");
		}

	}

}
