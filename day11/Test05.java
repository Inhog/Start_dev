package day11;

public class Test05 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("홍길동","인사부");
		System.out.println(emp1);
		
		emp1.close();
		
		//System.gc();// gc 호출 쓰레기값을찾아서 finalize()메소드를 실행함.
		emp1 = null;

	}

}
