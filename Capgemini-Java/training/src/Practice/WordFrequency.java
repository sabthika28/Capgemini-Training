package Practice;

import java.util.*;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String str = s.nextLine();
		
		String[] word = str.toLowerCase().split(" ");
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(String w : word) {
			if(map.containsKey(w)) {
				map.put(w, map.get(w)+1);
			}else {
				map.put(w, 1);
			}
		}
		System.out.println("Frequency : ");
		for(String k : map.keySet()) {
			System.out.println(k + " = "+map.get(k));
		}

	}

}
