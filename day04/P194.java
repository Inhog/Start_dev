package day04;

public class P194 {

	public static void main(String[] args) {
		int[] num = {77,99,88,40,100};
		
		
		for(int i = 0; i<num.length;i++){
			System.out.printf(" %3d",num[i]);
		}
		
		System.out.println("\n=======================================");
		
		int[] temp = new int[num.length*2];
		// 배열 복사
		System.arraycopy(num, 0, temp, 3, num.length); 		// 주소는 Object
		for(int data:temp){			
			System.out.println(data+" ");
		}
		
		System.out.println("\n=======================================");
		
		String[] name = {"홍길동","박보검","고길동"};
		System.out.println("name length => " + name.length);
		for(String data:name){
			System.out.println(data.charAt(0)+"**");
		}
		
		int[] score =null;
	}
}
