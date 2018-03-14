package day11;

public class Employee {
	private String name;
	private String dept;		//외부에서 직접 읽지는 못함
	
	
	public Employee(){}
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString(){				// 기본 toString 메소드 오버라이딩
		return name + " : " + dept;
	}
	
	@Override
	public boolean equals(Object obj){				// equals 함수를 오버라이딩해서 객체도 비교할 수 있게 !
		/*if(this.toString().equals(obj.toString()))		// 내가 한것. 문제가 있음.
			flag = true;
		*/
		if(!(obj instanceof Employee)){
			return false;
		}
		Employee target = (Employee)obj;
		if(name.equals(target.name)&&dept.equals(target.dept)){
			return true;
		}
		return false;
	}
	@Override
	protected void finalize() throws Throwable {			// 자원반납하는 메소드
		System.out.println("finalize() 수행 자원반납");
	}
	public void close(){
		System.out.println("자원반납........");
	}
	
}
