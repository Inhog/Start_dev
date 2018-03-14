package day11.tv;

public class TvTest {

	public static void main(String[] args) {
		TV  user = new LTv();
			user = new STv();
	}
}

interface TV{
}
class LTv implements TV{
	
}

class STv implements TV{
	
}
