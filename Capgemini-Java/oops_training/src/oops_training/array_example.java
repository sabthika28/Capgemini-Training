package oops_training;

public class array_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1}, {4,5},{7,8,9}}; 
		for(int i = 0; i< arr.length; i++) { //rows
			for(int j = 0; j< arr[i].length; j++) { //cols
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		for(int i[] : arr) {
			for(int j : i) {
				System.out.print(j + "-");
			}
			System.out.println();
		}
	}
}
