package test;

import java.util.Scanner;

public class SemMarks_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of semester:");
        int semesters = sc.nextInt();

        int[] subPerSem = new int[semesters]; // To store number of subjects per semester

        // Read subject count for each semester
        for (int i = 0; i < semesters; i++) {
            System.out.println("Enter no of subjects in " + (i + 1) + " semester:");
            subPerSem[i] = sc.nextInt();
        }

        // Read marks and compute maximum
        for (int i = 0; i < semesters; i++) {
            System.out.println("Marks obtained in semester " + (i + 1) + ":");
            int max = -1;

            for (int j = 0; j < subPerSem[i]; j++) {
                int mark = sc.nextInt();

                // Validate mark
                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    return; // Exit the program
                }

                // Update maximum mark
                if (mark > max) {
                    max = mark;
                }
            }

            System.out.println("Maximum mark in " + (i + 1) + " semester: " + max);
        }

	}

}
