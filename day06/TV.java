package day06;

public class TV {
	// 속성(데이터) + 기능 (함수 Method)
	int channel;
	String color;
	
	private boolean power;
	
	public boolean isPower(){
		return this.power;
	}
	public void setPower(boolean power){
		this.power = power;
	}
	
	public void channelUp(){
		channel++;
	}
	public void channelDown(){
		channel--;
	}
	public void power(){
		power= !power;
		return	 ;
	}
	public void print(){
		System.out.printf("[TV 색상 : %s Channel: %d  전원 :%b\n]",this.color,this.channel,this.power);
	}
}
