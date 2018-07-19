package fizz.decorator;

public class Fizz extends QuizDecorator {
	Quiz quiz;
	
	public Fizz(Quiz quiz) {
		this.quiz = quiz;
	}
	@Override
	public String getDesc() {
		String desc = "";
		if(Calculate.isQuiz(quiz.getCalNum(), 3)) 
			desc = "Fizz";
		return quiz.getDesc()+desc;
	}
	
}
