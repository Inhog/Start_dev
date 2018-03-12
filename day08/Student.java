package day08;

import java.util.Arrays;
//Source-> genarate constructor using field
public class Student {
	private String name;
	private int[] sungjuk;
	boolean flag;
	
	
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student() {
		super();
	}
	
	public Student(String name, int[] sungjuk) {
		super();
		this.name = name;
		this.sungjuk = sungjuk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getSungjuk() {
		return sungjuk;
	}

	public void setSungjuk(int[] sungjuk) {
		this.sungjuk = sungjuk;
	}

	public void print(){
		System.out.printf("Student[name:%s , %s]\n " , name,Arrays.toString(sungjuk));
	}
}
