package day03;

import java.util.Scanner;

public class P142 {

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

					if (score >= 90 && score <= 100) {
						grade = 'A';
						System.out.println("잘했습니다.");

					} else if (score >= 80 && score < 90) {
						grade = 'B';
						System.out.println("그냥 딱 평균");
					} else if (score >= 70 && score < 80) {
						grade = 'C';
						System.out.println("아쉽네요");
					} else if (score >= 60 && score < 70) {
						grade = 'D';
						System.out.println("재 수 강.");
					} else if (score >= 0 && score < 60) {
						grade = 'F';
						System.out.println("사람의 성적이 아닙니다.");
					} else {
						System.out.println("입력 오류. 다시 입력하세요");
						err = "CANNOT";
					}
				} else {
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
