package day08;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class P300 {
	int x;
	int y=x;
	static double pi = 3.14;
	public static void main(String[] args) {
		int x=9;
		int y=x;
		
		System.out.println(x);
		System.out.println(P300.pi);
		System.out.println(new P300().x);
	}

}
