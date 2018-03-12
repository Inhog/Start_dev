package day03;

public class Prob1 {

	public static void main(String[] args) {
		String sourceString = 
				"everyday we have is one more than we deserve";
		String encodedString = "";
		
		for(int i =0; i<sourceString.length();i++){
			
			char pm = sourceString.charAt(i);
			char key = (char) (pm +3);
			
			if( pm!=' '){
				
				if((pm +3) >122){
					encodedString += (char) (key-24);
				}
			/*	else if((pm +3) <97){
					encodedString += (char) (key+24);
				}*/
				else{
					encodedString += key;
				}
			}
			
			else{
				encodedString += ' ';
			}
		}
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
}