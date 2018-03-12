package day09.Prob1;

public class Student extends Person {
	private int id;
	
	
	public Student() {
	}

	public Student(int id) {
		this.id = id;
	}
	
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print(){
		System.out.printf("이	름 : %s 	나이 : %2d	학	번 : %s \n",this.getName(),this.getAge(),this.getId());
	}
}
