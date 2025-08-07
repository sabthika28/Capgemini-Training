package DSA;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> table=new Hashtable<String, String>();
		table.put("100", "Trichy");
		table.put("123", "salem");
		table.put("278", "karur");
		table.put("566", "chennai");
		
		for(String key:table.keySet())
			System.out.println(key.hashCode() % 11 +"\t" + key +"\t"+table.get(key));

	}

}
