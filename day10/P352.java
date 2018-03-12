package day10;

public class P352 {

	public static void main(String[] args) {
		//Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
	}
}


class Singleton{
	private Singleton(){
		System.out.println("Singleton() 객체 생성");
	}
	
	public static Singleton getInstance(){		// 이메소드는 주소없어도 동작할거야 -> static
		return new Singleton();
	}
}