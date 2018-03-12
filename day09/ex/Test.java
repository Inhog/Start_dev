package day09.ex;

public class Test {

	public static void main(String[] args) {
		Student s = new Student("홍길동",20,2018001);
		s.print();
		Teacher t = new Teacher("kim sam",30,"java");
		
	}
}

class Person extends Object{		// 따로 안적으면 이거 상속받음
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		super();
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

class Student extends Person{
	private int id;
	public Student(){}
	public Student(String name, int age,int id){
		super(name,age);
		this.id =id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void print(){
		System.out.printf("Student[%s , %d, %d]\n",getName(),getAge(),id);
	}
	
}

class Teacher extends Person{
	private String subject;
	
	public Teacher() {}
	public Teacher(String name, int age,String subject) {
		super(name,age);
		setName(name);
		setAge(age);
		this.subject = subject;
	}

	public void print(){
		System.out.printf("Teacher[%s , %d, %d]\n",getName(),getAge(),subject);
	}
}

class Employee extends Person{
	private String dept;
	
	public Employee(){}
	public Employee(String name,int age, String dept){
		super(name,age);
		this.dept = dept;
	}
	
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void print(){
		System.out.printf("Employee[%s , %d, %d]\n",getName(),getAge(),dept);
	}
}