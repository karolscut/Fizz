package test.fizz;

import fizz.FizzService;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class FizzTest {
	private FizzService fizzService = FizzService.initInstance();
	@Test
	public void testFizzResult_1() {
		int n=1;
		String result = fizzService.print(n);
		assertThat("1",is(result));
	}
	
	@Test
	public void testFizzResult_3() {
		int n=3;
		String result = fizzService.print(n);
		assertThat("Fizz",is(result));
	}
	
	@Test
	public void testFizzResult_5() {
		int n=5;
		String result = fizzService.print(n);
		assertThat("Buzz",is(result));
	}
	
	@Test
	public void testFizzResult_15() {
		int n=15;
		String result = fizzService.print(n);
		assertThat("FizzBuzz",is(result));
	}
	
	@Test
	public void testFizzResult_35_Fail() {
		int n=35;
		String result = fizzService.print(n);
		assertThat("FizzBuzz",is(result));
	}
}
