package oops_training;

import java.util.Scanner;

public class Twice_character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = ""; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result = result + ch + ch; 
        }

        System.out.println("String with doubled characters: " + result);
    }
}