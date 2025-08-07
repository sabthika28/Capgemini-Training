package training;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Joseph's");
		sb.append(" College");
		sb.insert(7, "of Engineering");
		sb.replace(0, 7, "St Joseph's");
		sb.delete(8, 12);
		sb.reverse();
		System.out.println(sb);
	}

}
