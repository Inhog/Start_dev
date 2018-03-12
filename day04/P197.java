package day04;

import java.util.Arrays;

public class P197 {

	public static void main(String[] args) {
		
		int[] score = new int[5];
		for(int i=0;i<score.length;i++){
			score[i] =(int) ((Math.random()*100));
		}
		System.out.println(Arrays.toString(score));
	}

}
