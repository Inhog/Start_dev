package day12;

public class PhoneTest {
	public static void main(String[] args) {
		PhoneInfo<String> p1 = new PhoneInfo<String>("홍길동","2018");	
		// <String>이므로 매개변수 2개 다 String 형으로 선언해 주어야 한다. 
		
		System.out.println(p1);
		
		PhoneInfo<Integer> p2 = new PhoneInfo<Integer>("김길동",2017);
		//	<>내부에 올 수 있는건 Object 타입이여야 하므로, int 가 아니라 Integer!
		System.out.println(p2);
		
		PhoneInfo p3 = new PhoneInfo("박길동",2015);
		// 제너릭을 따로 선언해주지 않는다면, Object 타입으로 자동으로 선언된다.
		System.out.println(p3);
	}
}
