package fizz.decorator;

public class Calculate {
	
	public static  boolean isQuiz(int quizNum,int divisor) {
		if(quizNum % divisor == 0 || String.valueOf(quizNum).contains(String.valueOf(divisor))) {
			return true;
		} else {
			return false;
		}		
	}
	
}
