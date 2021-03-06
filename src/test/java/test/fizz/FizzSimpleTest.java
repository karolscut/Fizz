package test.fizz;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

import fizz.simple.FizzService;

public class FizzSimpleTest {
	private FizzService fizzService = FizzService.initInstance();
	@Test
	public void testFizzResult_1() {
		int n=1;
		String result = fizzService.getFizzResult(n);
		assertThat("1",is(result));
	}
	
	@Test
	public void testFizzResult_3() {
		int n=3;
		String result = fizzService.getFizzResult(n);
		assertThat("Fizz",is(result));
	}
	
	@Test
	public void testFizzResult_5() {
		int n=5;
		String result = fizzService.getFizzResult(n);
		assertThat("Buzz",is(result));
	}
	
	@Test
	public void testFizzResult_15() {
		int n=15;
		String result = fizzService.getFizzResult(n);
		assertThat("FizzBuzz",is(result));
	}
	
	@Test
	public void testFizzResult_35_Fail() {
		int n=35;
		String result = fizzService.getFizzResult(n);
		assertThat("FizzBuzz",is(result));
	}
}
