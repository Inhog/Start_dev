package day04;

public class P163 {

	public static void main(String[] args) {
		System.out.println("*******   구구단    *******");
		OUT : for(int i = 0; i<=9;i++){
			for(int j =0; j<=9;j++){
				if(j==5) break OUT;		//이르붙이는 라벨링? P178
				//if(j==5)continue;
				System.out.printf("%2d*%d=%2d|",j,i,j*i);		// 보기까알끔
			}
			System.out.println();
		}
	}

}
