package Practice;

import java.util.*;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = s.nextLine().toLowerCase();
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == ' ')
				continue;
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println("The frequency is : ");
		for(char k : map.keySet()) {
			System.out.println(k + " = " + map.get(k));
		}

	}

}
