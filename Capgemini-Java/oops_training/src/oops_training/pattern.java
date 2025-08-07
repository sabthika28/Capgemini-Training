package oops_training;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++) {
			for(int j = 0; j <=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i = 5; i>=1; i--) {
			for(int j = 1; j <=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i = 1; i<5; i++) {
			for(int space = 1; space <= 5-i; space++) {
				System.out.print("  ");
			}
			for(int j = 1; j <=2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i = 0; i<5; i--) {
			for(int j = 0; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("---------------------");
		int num = 1;
		for(int i = 0; i<5; i--) {
			for(int j = 0; j <=i+1; j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}

}