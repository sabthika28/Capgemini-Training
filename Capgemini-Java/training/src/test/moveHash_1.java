package test;

public class moveHash_1 {
	static void moveHash(String str, int len) {
        String hash = "";   
        String text = "";   

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);  
            if (ch == '#') {
                hash += "#";   
            } else {
                text += ch;    
            }
        }

        String result = hash + text;  
        System.out.println(result);   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "Move#Hash#to#Front";
	        int len = input.length();
	        moveHash(input, len);

	}

}
