package fizz.decorator;

public abstract class Quiz {
	private String desc="";
	private static int calulateNum;
	public void setNum(int calulateNum) {
		this.calulateNum = calulateNum;
	}
	public int getCalNum() {
		return this.calulateNum;
	}
	public  String getDesc() {
		return desc;
	};
}
