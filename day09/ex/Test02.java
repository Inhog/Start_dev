package day09.ex;

public class Test02 {
	public static void main(String[] args) {
		Person s = new Student("홍길동",20,2018001);		// 부모 클래스에서 자식 클래스의 메소드를 호출할땐 다운캐스팅을 해줘야 한다.((자식클래스)클래스이름)
		if(s instanceof Student)						// 하지만 무턱대고 다운캐스팅을 하면 안되고 instanceof로 가능한지 확인 후 해야한다.
		((Student)s).print(); 							// 요로코롬
		Person t = new Teacher("kim sam",30,"Java");
		Person e = new Employee("김길동",50,"행정과");
		
		Person[] persons = {
		new Student("홍길동",20,2018001),			
		new Teacher("kim sam",30,"Java"),
		new Employee("김길동",50,"행정과")
		};
		
		for(int i=0;i<persons.length;i++){
			if(persons[i] instanceof Student){
				((Student)persons[i]).print();
			}
			else if(persons[i] instanceof Teacher){
				((Teacher)persons[i]).print();
			}
			else if(persons[i] instanceof Employee){
				((Employee)persons[i]).print();
			}
		}
	}
}

