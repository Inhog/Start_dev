package day03;

import java.util.Scanner;

public class P147 {

	public static void main(String[] args) {
		
		String name = null;
		int score = 0;
		char grade = ' '; // 'A' , 'B' , 'C'
		
		String err = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("성 적 처 리");
		while (true) {
			System.out.println("성적처리를  끝내려면 Q를 입력해주세용");
			String quit = scanner.nextLine();
			if (quit.equals("Q")) {
				System.out.println("성 적 처 리 종료");
				break;
			} else {
				System.out.println("이름을 입력하세요");
				name = scanner.nextLine();
				if (!(name == null || name.length() == 0)) {
					System.out.println("성적을 입력하세요");
					/*
					 * score = scanner.nextInt(); scanner.nextLine();
					 */
					score = Integer.parseInt(scanner.nextLine());
					switch(score){
					case 100:
					case 99:
					case 98:
					case 97:
					case 96:
					case 95:
					case 94:
					case 93:
					case 92:
					case 91:
					case 90:
						grade = 'A';
						System.out.println("잘했습니다.");
						break;
					case 89:
					case 88:
					case 87:
					case 86:
					case 85:
					case 84:
					case 83:
					case 82:
					case 81:
					case 80:
						grade = 'B';
						System.out.println("평균.");
						break;
					default:
						System.out.println("입력 오류. 다시 입력하세요");
						err = "CANNOT";
					}
				} 
				else {
					System.out.println("입력 오류. 다시 입력하세요");
					err = "CANNOT";
				}
			}
			if (!err.equals("CANNOT")) {
				System.out.printf("이름 = %s 점수 = %d 등급 = %c\n", name, score, grade);
				err = "CAN";
			}
		}
		return;
	}
}
