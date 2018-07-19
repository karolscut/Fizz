package test.fizz;

import fizz.decorator.QuizUtil;
import fizz.decorator.QuizNum;

public class QuizDecoratorTest {
	String description = "";

	public String getDescription() {
		return description;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			QuizNum quizNum = new QuizNum(i);
			QuizUtil quiz2 = new QuizUtil(quizNum);
			String result = quiz2.getDesc();
			System.out.println(result);
		}
	}
}
