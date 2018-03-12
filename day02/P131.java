package day02;

public class P131 {

	public static void main(String[] args) {
		int score =84;

		boolean valid = 0<= score  && score <= 100;
		if(!valid){
			System.out.println("데이터 입력 오류");
			return;				// 함 수 종 료
		}
		System.out.println(score + "우수 ? " + (score>=80));
		System.out.println(score + "재시험 ? " + (score < 70));
		
	}

}
