package day06;

import day05.Student;

public class TVTest {

	public static void main(String[] args) {
		
		TV t1 = new TV();
		t1.color = "black";
		//System.out.println(t1.channel+","+t1.color+","+t1.power);
		if(t1.isPower()== false){
			t1.power();
		}
		t1.channelUp();
		t1.channelUp();
		t1.print();
		
		TV t2 = new TV();
//		System.out.println(t2.channel+","+t2.color+","+t2.power);
		t2.print();
		
		System.out.println("=============================");
		int[] num = {7,9,2};
		String[] name	= {"홍","경","고"};
		Student[] students = {new Student(),new Student(),new Student()};
		TV[] t = {new TV(),new TV(),new TV()};
		
		for(TV data:t){
			data.print();
		}
		
		for(int i=0; i<students.length;i++){
			students[i].display();
		}
	}

}
