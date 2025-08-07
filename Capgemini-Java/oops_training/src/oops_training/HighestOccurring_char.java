package oops_training;

public class HighestOccurring_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Hello World";

	        int[] freq = new int[256]; // for all ASCII characters

	        for (int i = 0; i < str.length(); i++) {
	            freq[str.charAt(i)]++;
	        }

	        char maxChar = str.charAt(0);
	        int maxCount = freq[maxChar];

	        for (int i = 1; i < str.length(); i++) {
	            if (freq[str.charAt(i)] > maxCount) {
	                maxChar = str.charAt(i);
	                maxCount = freq[str.charAt(i)];
	            }
	        }

	        System.out.println("Highest occurring character: " + maxChar);
	        System.out.println("Frequency: " + maxCount);

	}

}
