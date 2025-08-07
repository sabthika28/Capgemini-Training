package oops_training;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String Comparision : '==' vs 'equals()'
		String s1 = "Java";
		String s2 = "Java";// String pool
		String s3 = new String("Java"); //heap
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		// == checks for the reference
		// equals()checks content
		System.out.println(s1.equals(s3));//true

	}

}
