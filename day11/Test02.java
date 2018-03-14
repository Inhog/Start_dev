package day11;

public class Test02 {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1.equals(s2));
		
		String ss1 = "Hello";
		String ss2 = "Hello";
		System.out.println(ss1.equals(ss2));
		
		Employee emp1 = new Employee("홍길동","기획실");
		Employee emp2 = new Employee("홍길동","기획실");
		
		System.out.println(emp1.equals(emp2));		//false
	}
}
