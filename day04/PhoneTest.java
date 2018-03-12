package day04;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		boolean flag = true;
		
		while(flag){
			System.out.println("선택하세요... 예) 1,2,3,4");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 회원 목록 보기");
			System.out.println("3. 회원 조회");
			System.out.println("4. 프로그램 종료");
			System.out.printf("선택 :");
			String data = Scanner.nextLine();
			
			
			switch(data){
			case "1":
				System.out.println("1. 데이터 입력");
				System.out.println("처리중~~~");
				break;
			case "2":
				System.out.println("2. 목록");
				System.out.println("처리중~~~");
				break;
			case "3":
				System.out.println("3. 조회 ");
				System.out.println("처리중~~~");
				break;
			case "4":
				System.out.println("4. 종료");
				System.out.println("안녕히 가십시옹");
				//return;					// 수행중인 함수 종료
				System.exit(0); 			// 프로그램 종료
				
			default:
				System.out.println("잘못 입력하셨습니다.");					
					
				
			}
		}
	}

}
