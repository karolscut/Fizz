package fizz;

public class FizzService {
	private static FizzService instance;

	private FizzService() {
	}

	public static FizzService initInstance() {
		if (instance == null) {
			instance = new FizzService();
		}
		return instance;
	}

	private boolean isDividable(int dividend, int divisor) {
		if (divisor == 0) {
			return false;
		}
		return dividend % divisor == 0;
	}

	public String getFizzResult(int n) {
		String result = String.valueOf(n);
		if (isDividable(n, 3) && isDividable(n, 5)) {
			result = Constants.FIZZ_BUZZ;
		} else if (isDividable(n, 3)) {
			result = Constants.FIZZ;
		} else if (isDividable(n, 5)) {
			result = Constants.BUZZ;
		}
		return result;
	}
	
	public String getFizzResult1(int n) {
		String result = String.valueOf(n);
		if (isDividable(n, 3) && isDividable(n, 5)) {
			result = Constants.FIZZ_BUZZ;
		} else if (isDividable(n, 3)) {
			result = Constants.FIZZ;
		} else if (isDividable(n, 5)) {
			result = Constants.BUZZ;
		}
		return result;
	}
}
