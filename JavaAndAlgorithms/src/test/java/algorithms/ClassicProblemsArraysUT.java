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
	
	@Test
	public void whenNullArrayThenEmptyArray(){
		int[] arrayToTest = null;
		int[] arrayWithoutDups = classicProblems.removeDupsIntArray(arrayToTest);
		assertThat(arrayWithoutDups).isEmpty();
	}
	
	@Test
	public void whenEmptyArrayThenEmptyArray(){
		int[] arrayToTest = {};
		int[] arrayWithoutDups = classicProblems.removeDupsIntArray(arrayToTest);
		assertThat(arrayWithoutDups).isEmpty();
	}
	
	
	@Test
	public void whenArrayThenArrayWithoutDups1(){
		int[] arrayToTest = {1};
		int[] arrayWithoutDups = classicProblems.removeDupsIntArray(arrayToTest);
		assertThat(arrayWithoutDups).hasSize(1);
	}
	
	@Test
	public void whenArrayThenArrayWithoutDups2(){
		int[] arrayToTest = {1,2};
		int[] arrayWithoutDups = classicProblems.removeDupsIntArray(arrayToTest);
		assertThat(arrayWithoutDups).hasSize(2);
		assertThat(arrayWithoutDups[1]).isEqualTo(2);
	}
	
	@Test
	public void whenArrayThenArrayWithoutDups3(){
		int[] arrayToTest = {1,2,1};
		int[] arrayWithoutDups = classicProblems.removeDupsIntArray(arrayToTest);
		assertThat(arrayWithoutDups).hasSize(2);
		assertThat(arrayWithoutDups[1]).isEqualTo(2);
	}
	
	@Test
	public void whenArrayThenArrayWithoutDups4(){
		int[] arrayToTest = {1,2,1,3,4,5,5,6,7,2,8,9,15,9,10};
		int[] arrayWithoutDups = classicProblems.removeDupsIntArray(arrayToTest);
		assertThat(arrayWithoutDups).hasSize(11);
		assertThat(arrayWithoutDups[10]).isEqualTo(15);
	}

}
