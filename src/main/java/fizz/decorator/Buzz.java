package fizz.decorator;

public class Buzz extends QuizDecorator {
	Quiz quiz;
	public Buzz(Quiz quiz) {
		this.quiz = quiz;
	}
	@Override
	public String getDesc() {
		String desc = "";
		if(Calculate.isQuiz(quiz.getCalNum(), 5)) 
			desc = "Buzz";
		return quiz.getDesc()+desc;
	}
	
}
