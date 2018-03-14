package day12;

public class PhoneInfo<T> {
	// 이 클래스를 구현할 때 타입을 정하지않고, 선언함과 동시에 타입을 결정하여 유연하게 클래스를 정의할 수 있다.
	// <T,P> 이렇게 여러개를 동시에 설정해 둘 수있다.
	// private P name; 이렇게
	private String name;
	private T year; //? 제너릭릭릭
	
	public PhoneInfo(){}
	public PhoneInfo(String name, T year) {
		this.name = name;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getYear() {
		return year;
	}
	public void setYear(T year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", year=" + year + "]";
	}
	
	
	
}
