package Practice;

import java.util.Scanner;

class noVowelsException extends Exception{
	public noVowelsException(String message) {
		super(message);
	}
}

public class vowelException{
	public static void checkVowels(String input) throws noVowelsException{
		input = input.toLowerCase();
		if(!(input.contains("a")||input.contains("e")||input.contains("i")||input.contains("o")||input.contains("u"))) {
			throw new noVowelsException("The sting does not contain any vowels");
		}else {
			System.out.print("The string contains vowels");
		}
	}
	


    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter a string : ");
       String str = s.nextLine();
       
       try {
    	   checkVowels(str);
       }catch(noVowelsException e){
    	   System.out.print("Exception : "+ e.getMessage());
       }
       
       

	}

}
