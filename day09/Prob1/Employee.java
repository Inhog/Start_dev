package day09.Prob1;

public class Employee extends Person{
	private String dept;
	
	public Employee(){
	}
	
	public Employee(String dept) {
		this.dept = dept;
	}

	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	} 
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print(){
		System.out.printf("이	름 : %s 	나이 : %2d	부	서 : %s \n",this.getName(),this.getAge(),this.getDept());
	}
}
