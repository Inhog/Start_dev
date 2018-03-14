package day12;

import java.util.Arrays;
import day11.Employee;

public class Test01 {

	public static void main(String[] args) {
		String[] names = {"홍길동","김길동","박길동","최길동"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Employee[] emps={
				new Employee("최길동","기획부"),
				new Employee("김길동","기획부"),
				new Employee("박길동","교육부"),
				new Employee("홍길동","관리부")
		};		// Employee 클래스는 비교할 수 있는 메소드가 없는데 Compareable? 이라는 인터페이스를 활용하여 가능하게 해야함.
		
		System.out.println(Arrays.toString(emps));
		Arrays.sort(emps);
		System.out.println(Arrays.toString(emps));

	}
}
