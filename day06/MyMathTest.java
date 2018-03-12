package day06;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath calc1 = new MyMath();
		MyMath calc2 = new MyMath();
		MyMath calc3 = new MyMath();
		
		Student s = new Student();
		char c = s.grade();
		
		int result = calc1.add(4, 6);
		
		System.out.println(calc1.add(99, 345));
		System.out.println(calc2.add(99, 345));
		System.out.println(calc3.add(99, 345));
		
		System.out.println(MyMath.add(77,666));
	}
}
