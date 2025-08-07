package oops_training;

import java.util.Arrays;
import java.util.List;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = {"Coimbatore","Chennai","Erode","Salem"};
		//int i = 0; i < array.length; i++
		//enhanced loop
		//for(element : array)
		for(String city : cities) {
			System.out.println(city + " ");
		}
		System.out.println();
		// using forEach method 
		List list = Arrays.asList("Coimbatore","Chennai","Erode","Salem");
		list.forEach(city -> System.out.println(city + " = "));

	}

}
