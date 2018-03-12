package day07;

import util.MyArrays;

public class MyArrayTest {
	public static void main(String[] args) {
		int[] sungjuk = {90,77,44,22,33,55,66,15};
		MyArrays.print(sungjuk);
		int[] sortdata = MyArrays.sort(sungjuk);
		MyArrays.print(sungjuk);
		MyArrays.print(sortdata);
	}
}
