package DSA;

public class SumColWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2},{3,4}};
		int[][] b = {{5,6},{7,8}};
		int[][] sum = new int[2][2];
		
		for (int j = 0; j < 2; j++) {
            int colSum = 0;
            for (int i = 0; i < 2; i++) {
                sum[i][j] = a[i][j] + b[i][j]; 
                colSum += sum[i][j];    
            }
            System.out.println("Sum of col " + (j + 1) + ": " + colSum);
        }


	}

}
