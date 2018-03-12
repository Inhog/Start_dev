package day02;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
		String name =null;
		int age =0;
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하세요!");
		name = input.nextLine();
		System.out.println("나이를 입력하세요!");
		//age = Integer.parseInt(input.nextLine());		// 한줄의 끝 = 엔터
		age = input.nextInt();		// int 입력 단위 하나만 입력받는다
		input.nextLine();		// 엔터 전까지 라인을읽어들인다
		System.out.printf("입력한 이름은 %s \n 입력한 나이는  %d \n",name,age);
		
	}

}
