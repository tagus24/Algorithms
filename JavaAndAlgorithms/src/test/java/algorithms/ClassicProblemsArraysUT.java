package algorithms;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class ClassicProblemsArraysUT {
	
	ClassicProblemsArrays classicProblems = new ClassicProblemsArrays();
	
	
	@Test
	public void whenEmptyArryayThenRotate(){
		String[] arrayToRotate = {};
		String[] result = classicProblems.rotateAnArray(arrayToRotate);
		assertThat(result.length).isEqualTo(0);
	}
	
	@Test
	public void whenArryayWithOneElemThenRotate(){
		String[] arrayToRotate = {"1"};
		String[] result = classicProblems.rotateAnArray(arrayToRotate);
		assertThat(result[0]).isEqualTo("1");
	}
	
	@Test
	public void whenArryaThenRotate(){
		
		String[] arrayToRotate = {"1","2","3","4","5"};
		String[] result = classicProblems.rotateAnArray(arrayToRotate);
		assertThat(result[0]).isEqualTo("5");
		assertThat(result[1]).isEqualTo("4");
		assertThat(result[2]).isEqualTo("3");
		assertThat(result[3]).isEqualTo("2");
		assertThat(result[4]).isEqualTo("1");
	}
	
	////////////////////////////////////////////////////////
	
	
	
	

}
