package day04;

public class P189 {

	public static void main(String[] args) {
		
		String[] name = {"홍길동","김길동","고길동","박길동","강길동"};
		int[] score = null;
		score = new int[5];
		
		score[0] = 88;
		score[1] = 98;
		score[2] = 89;
		score[3] = 78;
		score[4] = 100;
		
		char[] grade= new char[score.length];
		for(int i=0;i<score.length;i++){
			grade[i] = score[i]>=90?'A':score[i]>=80?'B':'F';
			System.out.println(name[i].charAt(0) + "OO : "+	score[i]+ ", " + grade[i]);
		}
	}
}
