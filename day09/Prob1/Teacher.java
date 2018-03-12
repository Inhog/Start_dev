package day09.Prob1;

public class Teacher extends Person{
	private String subject;
	
	
	public Teacher() {
	}
	
	public Teacher(String subject) {
		this.subject = subject;
	}

	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print(){
		System.out.printf("이	름 : %s 	나이 : %2d	담당과목 : %s \n",this.getName(),this.getAge(),this.getSubject());
	}
	
}
