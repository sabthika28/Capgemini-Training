package training;

record Staff(int id, String name) {
	
}

public class Enumeration_2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff st = new Staff(11, "sabthika");
		System.out.println(st.id());
		System.out.println(st.name());
	}
}