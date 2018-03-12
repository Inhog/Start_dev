package day09;

import java.util.Date;

import day08.ex.Book;

public class Test03 {
	public static void main(String[] args) {
		//is a 관계 : 모든 Data Type 은 부모가 될 수 있다.
		Animal a = new Animal();
		
		Object a2 = new Animal();
		
		if(a2 instanceof String)				// 바꿀 수 있다면
			((String)a2).trim();
		
		if(a2 instanceof Animal)
			((Animal)a2).breath();
		
		Object d = new Dog();
		d="~~~";		// d = new String("~~~"); 근데 String의 부모 객체가 Object라서 그냥 가능
		Animal d2 = new Dog();
		Dog d3 = new Dog();
		
		Book[] books;
		Animal[] animals;
		Dog[] dogs;
		Object[] objects;
		
		
		Object obj1 = new Date();
		Object obj2 = new Book();
		Object obj3 = new String("홍길동");
		Object obj4 = new Integer(5);
	}
}
