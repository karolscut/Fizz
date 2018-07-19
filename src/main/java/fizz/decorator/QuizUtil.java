package fizz.decorator;

public class QuizUtil  {
	Quiz quiz;
	public QuizUtil(Quiz quiz) {
		this.quiz = quiz;
	}
	
	public String getDesc() {
		Quiz fizz =new Fizz(quiz);
		Quiz buzz = new Buzz(fizz);
		if(buzz.getDesc().length()==0)
			return String.valueOf(quiz.getCalNum());
		return buzz.getDesc();
	}
	
}
