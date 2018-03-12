package day06;

import java.util.Arrays;

import day07.Car;

public class Student {
	String name;
	//int kor,math,eng;
	private Car car;
	private int[] sungjuk = new int[3];
	double avg;
	
	public void setCar(Car c){
		this.car = c;
	}
	public Car getCar(){
		return this.car;
	}
	
	public void setSungjuk(int[] sungjuk){
		this.sungjuk = sungjuk;
	}
	
	public int[] getSungjuk(){
		return this.sungjuk;
	}
	
	public double calcAvg(){
		if(sungjuk== null || sungjuk.length==0){
			return 0.0;
		}
		int sum =0;
		for(int i =0; i<sungjuk.length;i++){
			sum += sungjuk[i];
		}
		return avg = sum/sungjuk.length;
	}
	// grade 함수
	
	public char grade(){
		double data=calcAvg();
		return data >=90?'A':data>=80?'B':'F';
	}
	public void print(){
		System.out.print("학생이름: "+ this.name);
		System.out.println("성적 :" + Arrays.toString(sungjuk));
		System.out.printf("평균 : %5.2f,등급 : %c\n",this.calcAvg(),this.grade());
	}
}
