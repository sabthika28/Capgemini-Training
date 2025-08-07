package DSA;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}

