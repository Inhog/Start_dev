package day11;

public class Test04 {
	public static void main(String[] args) {
		Student s1 = new Student("임인호",20124120);
		Student s2 = new Student("임인호",20124120);
		Student s3 = new Student("임인호",20124120);
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println(s2.equals("~~~~"));
		
		System.out.println(s1.getClass());
		System.out.println("".getClass());		// 안써본 메소드는 확인해봐야한다.
	}
}
