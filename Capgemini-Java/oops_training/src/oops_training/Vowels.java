package oops_training;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count vowels
		String str = "Joseph Engineering College";
		str = str.toLowerCase();
		int count = 0;
		for(char c : str.toCharArray()) {
			if("aeiou".indexOf(c) != -1)
				count ++;
		}
		System.out.println("No of vowels are "+ count);
		System.out.println();
		
		String[] arr = str.split(" ");
		for(String s : arr) {
			System.out.println(s.toUpperCase()); 
		}
		System.out.println();
		// O/P:
			//JOSEPH
			//ENGINEERING
			//COLLEGE
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i].toUpperCase()); // reverse the words
		}
		//O/P:
			//COLLEGE
			//ENGINEERING
			//JOSEPH


	}
	

}
