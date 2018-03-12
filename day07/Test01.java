package day07;

public class Test01 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.print();
		
		Card c2= new Card();
		c2.print();
		
		String msg = new String("~~~~~~");
		System.out.println(msg);
		
		
		System.out.println("===================");
		
		Car t1 = new Car();
		Car t2 = new Car("White","Auto",4);
		Car t3 = new Car("Gray","Auto",4);
		Car t4 = new Car("Red","Auto",4);
		
		t1.print();
		t2.print();
		t3.print();
		t4.print();
		
		Book b1 =new Book("d",4);
		b1.print();
	}

}
