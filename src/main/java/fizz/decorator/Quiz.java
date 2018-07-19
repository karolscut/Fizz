package fizz.decorator;

public abstract class Quiz {
	private String desc="";
	 static int calulateNum;
	public void setNum(int calulateNum) {
		Quiz.calulateNum = calulateNum;
	}
	public int getCalNum() {
		return Quiz.calulateNum;
	}
	public  String getDesc() {
		return desc;
	};
}
