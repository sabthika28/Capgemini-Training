package oops_training;

public class Java_Exception {

	static void calculate(String[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		try {
			for(String s : arr) {
				int num = Integer.parseInt(s);
				sum += num;
			}
			int n = 10/0;
			System.out.println("Division "+n);
		}
		catch(NumberFormatException nf) {
			System.err.println("Hey, Please enter digits only.");
		}
		catch(ArithmeticException a) {
			System.out.println(a.getMessage());
		}
		finally {
			System.out.println("This block must executes.");
		}
		System.out.println("Sum "+sum);
	}
	public static void main(String[] args) {
		calculate(args); 
	}

}
