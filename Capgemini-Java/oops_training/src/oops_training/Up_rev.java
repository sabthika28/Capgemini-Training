package oops_training;

interface StringOperation{
	void operation(String str);
}

public class Up_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperation upper = (str) -> System.out.println(str.toUpperCase());
		StringOperation reverse = (str) -> System.out.println(new StringBuilder(str).reverse());
		
		upper.operation("joseph");
		reverse.operation("joseph");
	}

}
