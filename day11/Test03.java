package day11;

import java.util.Date;

import day08.Student;

public class Test03 {

	public static void main(String[] args) {
		
		Object[] obj = {
				"Hello",
				new Employee("홍길동","기획실"),
				new Employee("홍길동","기획실"),
				new Date(),
				new Student()
		};
		
		for(int i=0;i<obj.length;i++){
			System.out.println(obj[i]);			// toString()
		}
		System.out.println("========================");
		System.out.println(obj[1].equals(obj[2]));
	}
}
