package DSA;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
		int key = 5;
		boolean found = false;
		 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == key) {
					System.out.println("Found at : ( "+ i + ","+ j + ")");
					found = true;
					break;
				}	
			}
			if(found) {
				break;
			}
		}
		if(!found) {
			System.out.println("Element not found.");
		}

	}

}
