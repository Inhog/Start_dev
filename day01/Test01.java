package day01;

public class Test01 {

	public static void main(String[] args) {
		int money= (int)500.5;		// 타입 캐스팅
		money =  money+700;
		
		System.out.println("money : "+ money);
		System.out.println(300 + 300 + 300 +"원");
		System.out.println("원" +300 +300+300);
		
		double pi = 3.14;
		System.out.println("반지름이 3인 원의 면적 :" + pi *3*3);
		
		String name = new String("hong gil dong");
		System.out.println(name.toUpperCase());
	}

}