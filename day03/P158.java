package day03;

public class P158 {

	public static void main(String[] args) {
		
		String msg = "				Hello jave Programming Test 	";
		System.out.printf("[%s] %d \n", msg, msg.length());
		msg = msg.trim();		
		System.out.printf("[%s] %d \n", msg, msg.length());
		System.out.println(msg.charAt(0));
		System.out.println(msg.charAt(msg.length()-1));

	}

}
