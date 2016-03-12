package algorithms;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class BasicMathAlgorithmsUT {
       
	
	BasicMathAlgorithms basicMathAlgorithms = new BasicMathAlgorithms();
	
	@Test
	public void whenFactorialIterativeZerothenOne(){
    
		int test1 = basicMathAlgorithms.factorialIterative(0);
		assertThat(test1).isEqualTo(1);
    }
	
	@Test
	public void whenFactorialIterativeOnethenOne(){
    
		int test1 = basicMathAlgorithms.factorialIterative(1);
		assertThat(test1).isEqualTo(1);
    }
	
	@Test
	public void whenFactorialIterativeNthenResult(){
    
		int test1 = basicMathAlgorithms.factorialIterative(10);
		assertThat(test1).isEqualTo(3628800);
    }
	
	@Test
	public void whenFactorialRecursiveZeroNthenOne(){
    
		int test1 = basicMathAlgorithms.factorialRecursive(1);
		assertThat(test1).isEqualTo(1);
    }
	
	@Test
	public void whenFactorialRecursiveOneNthenOne(){
    
		int test1 = basicMathAlgorithms.factorialRecursive(1);
		assertThat(test1).isEqualTo(1);
    }
	
	@Test
	public void whenFactorialRecursiveNthenResult(){
    
		int test1 = basicMathAlgorithms.factorialRecursive(10);
		assertThat(test1).isEqualTo(3628800);
    }
	
	
	///////////////////////////////////////////
	
	
	@Test
	public void whenfibonacciIterativeNthenResult(){
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		String test1 = basicMathAlgorithms.fibonacciIterative(10);
		assertThat(test1).isEqualTo("1,1,2,3,5,8,13,21,34,55");
    }
	
	@Test
	public void whenfibonacciRecursiveNthenResult(){
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		String test1 = basicMathAlgorithms.fibonacciNNumbers(10);
		assertThat(test1).isEqualTo("1,1,2,3,5,8,13,21,34,55");
    }
	
}


