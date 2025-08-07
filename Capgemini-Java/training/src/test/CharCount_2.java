package test;

public class CharCount_2 {
	 static void compress(String str) {
	        int len = str.length();
	        String result = "";  

	        int count = 1; 

	        for (int i = 0; i < len - 1; i++) {	           
	            if (str.charAt(i) == str.charAt(i + 1)) {
	                count++;
	            } else {
	                result += str.charAt(i);

	                if (count > 1) {
	                    result += count;
	                }
	                count = 1; 
	            }
	        }
	        result += str.charAt(len - 1);
	        if (count > 1) {
	            result += count;
	        }

	        System.out.println(result);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method 
		compress("aabbbbeeeeffggg");  
        compress("abbccccc");          
	}

}
