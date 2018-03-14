package subject;

public class PhoneInfo {
	private String name;
	private String phoneNum;
	public PhoneInfo(){}
	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof PhoneInfo)){
			return false;
		}else{
			PhoneInfo temp = ((PhoneInfo)obj);
			if(temp.name == this.name && temp.phoneNum == this.phoneNum)
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "[PhoneInfo : " + name + ", " + phoneNum + "]";
	}
	
	
}
