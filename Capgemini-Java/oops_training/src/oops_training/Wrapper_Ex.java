package oops_training;

public class Wrapper_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 420;
		Integer y = x;
		int z = y;
		System.out.println(x+" "+y+" "+z);
		
		System.out.println("Max Value = "+Integer.MAX_VALUE);
		System.out.println("Min Value = "+Integer.MIN_VALUE);
		System.out.println("Size = "+Integer.SIZE);
		
		int n1 = 15; int n2 = 10;
		
		float div = n1/n2;
		System.out.println("Division = "+div);
		int r = 12;
		float area = (float)Math.PI * r * r;
		System.out.println(area);
		
		String str = "Joseph";
		str.concat("Engineering");
		System.out.println(str);
		
		
		

	}

}
