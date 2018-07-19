package test.fizz;

import fizz.FizzService;

public class FizzPrintTest {
	public static void main(String[] args) {
		 FizzService fizzService = FizzService.initInstance();
		for(int i=1;i<=100;i++) {
			System.out.println(fizzService.getFizzResult(i));
		}
	}

}
