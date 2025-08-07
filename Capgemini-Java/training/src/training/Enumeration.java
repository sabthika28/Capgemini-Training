package training;

enum Colors{
	RED,
	GREEN,
	BLACK,
	BLUE
}

public class Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colors red = Colors.RED;
		System.out.println(red);
		for(Colors c : Colors.values()) {
			System.out.print(c+ " ");
		}
		System.out.println(red.ordinal());
		

	}

}
