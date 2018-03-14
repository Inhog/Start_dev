package day12;

public class InnerTest {

	public static void main(String[] args) {
//		A a = new A();
//		a.p();
		
		A.B b = new A().new B();		// 내부 클래스를 이렇게 선언한다.
		b.bp();
		
//		A.S s = new A.S();
//		s.sp();
	}
}


class A{
	String name ="A";
	void p(){
		System.out.println("여기는 A");
		System.out.println(name);
	}
	void print(){
		new B().bp();
		new S().sp();
	}
	
	class B{
		String name = "B";
		void bp(){
			System.out.println("여기는 A안에 B");
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(A.this.name);			// 외부 클래스의 변수를 호출할 때
		}
	}
	
	static class S{
		void sp(){
			System.out.println("~~~");
		}
	}

}


