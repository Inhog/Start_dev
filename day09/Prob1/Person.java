package day09.Prob1;

public class Person {
	protected String name = "기본이름";
	protected int age = 26;
	public static void main(String[] args) {
		Student s1 = new Student("홍길동",20,200201);
		Teacher t1 = new Teacher("이순신",30,"JAVA");
		Employee e1 = new Employee("유관순",40,"교무과");
		Student s2 = new Student();
		Student s3 = new Student(5455452);
		
		
		s1.print();
		s2.print();
		s3.print();
		t1.print();
		e1.print();
	}
	
	
	public Person(){
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
