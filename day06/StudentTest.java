package day06;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		int[] sungjuk = {88,99,93};
		s.setSungjuk(sungjuk);//배열의선언과 동시에 초기화 해야한다.
		s.calcAvg();
		//System.out.println(s.calcAvg()+":"+s.grade());
		//s.print();
		
		Student s1 = new Student();
		s1.name="고길동";
		s1.setSungjuk(new int[]{88,99,93});
		
		Student s2 = new Student();
		s2.name="임인호";
		//s2.sungjuk= new int[]{77,88,55};
		
		Student[] students = {s,s1,s2};
		for(int i=0;i<students.length;i++){
			students[i].print();
		}
		
		
	}

}
