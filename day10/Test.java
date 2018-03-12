package day10;

public class Test {

	public static void main(String[] args) {
		Person[] persons ={
		new Student("홍길동",20,2018001),
		new Teacher("kim sam",30,"java"),
		new Employee("김길동",50,"행정과")
		};
		for(int i=0;i<persons.length;i++){
			persons[i].print();
		}
	}
}

class Person extends Object{		// 따로 안적으면 이거 상속받음
	private String name;
	private int age;
	
	public Person() {}
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
	public void print(){
		System.out.printf("Person[이름 : %s , 나이 : %d]",name,age);
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
		super.print();				// 오버라이딩 된 부모의 메소드 호출 시 방법은 이것뿐.
		System.out.printf("Student[%d]\n",id);
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
		super.print();
		System.out.printf("Teacher[%s]\n",subject);
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
		super.print();
		System.out.printf("Employee[%s ]\n",dept);
	}
}