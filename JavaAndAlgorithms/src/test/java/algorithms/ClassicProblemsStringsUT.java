package algorithms;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class ClassicProblemsStringsUT {
	
	ClassicProblemsStrings classicProblemsStrings = new ClassicProblemsStrings();
	
	@Test
	public void whenNullStringThenNoDuplicates(){
		
		String toProcess = null;
		String result = classicProblemsStrings.getDuplicateCharacters(toProcess);
		assertThat(result).isEqualTo("");
		
	}
	
	@Test
	public void whenEmptyStringThenNoDuplicates(){
		
		String toProcess = "";
		String result = classicProblemsStrings.getDuplicateCharacters(toProcess);
		assertThat(result).isEqualTo("");
		
	}

	@Test
	public void whenNoDupsStringThenNoDuplicates(){
		
		String toProcess = "abcde";
		String result = classicProblemsStrings.getDuplicateCharacters(toProcess);
		assertThat(result).isEqualTo("");
		
	}
	
	@Test
	public void whenStringWithDupsThenDupsString1(){
		
		String toProcess = "abcdde";
		String result = classicProblemsStrings.getDuplicateCharacters(toProcess);
		assertThat(result).isEqualTo("dd");
		
	}
	
	@Test
	public void whenStringWithDupsThenDupsString2(){
		
		String toProcess = "aacddecbebtya";
		String result = classicProblemsStrings.getDuplicateCharacters(toProcess);
		assertThat(result).isEqualTo("aaddcceebb");
		
	}
	
	//////////////////////////////////////////// VERIFY ANAGRAMS
	
	@Test
	public void whenStringsAreAnagramThentrue1(){
		
		String s1 = "";
		String s2 = "";
		boolean result = classicProblemsStrings.verifyIfStringsAreAnagrams(s1, s2);
		assertThat(result).isEqualTo(true);
		
	}
	
	@Test
	public void whenStringsAreAnagramThentrue2(){
		
		String s1 = "a";
		String s2 = "a";
		boolean result = classicProblemsStrings.verifyIfStringsAreAnagrams(s1, s2);
		assertThat(result).isEqualTo(true);
		
	}
	
	@Test
	public void whenStringsAreAnagramThentrue(){
		
		String s1 = "abcdefg";
		String s2 = "gfedcba";
		boolean result = classicProblemsStrings.verifyIfStringsAreAnagrams(s1, s2);
		assertThat(result).isEqualTo(true);
		
	}
	
	@Test
	public void whenStringsAreAnagramThenfalse1(){
		
		String s1 = "a";
		String s2 = "v";
		boolean result = classicProblemsStrings.verifyIfStringsAreAnagrams(s1, s2);
		assertThat(result).isEqualTo(false);
		
	}
	
	@Test
	public void whenStringsAreAnagramThenfalse2(){
		
		String s1 = "a";
		String s2 = "aa";
		boolean result = classicProblemsStrings.verifyIfStringsAreAnagrams(s1, s2);
		assertThat(result).isEqualTo(false);
		
	}
	
	@Test
	public void whenStringsAreAnagramThenfalse3(){
		
		String s1 = "";
		String s2 = "a";
		boolean result = classicProblemsStrings.verifyIfStringsAreAnagrams(s1, s2);
		assertThat(result).isEqualTo(false);
		
	}
	
	@Test
	public void whenStringsAreAnagramThenfalse4(){
		
		String s1 = "abcdef";
		String s2 = "fehdcba";
		boolean result = classicProblemsStrings.verifyIfStringsAreAnagrams(s1, s2);
		assertThat(result).isEqualTo(false);
		
	}
	
	
	///////////////////////////////First non repeated char
	

	@Test
	public void whenNonRepeatedThenReturnChar1(){
		
		String s1 = "";
		String result = classicProblemsStrings.firstNonRepeatedCharInString(s1);
		assertThat(result).isEqualTo("");
		
	}
	
	@Test
	public void whenNonRepeatedThenReturnChar2(){
		
		String s1 = null;
		String result = classicProblemsStrings.firstNonRepeatedCharInString(s1);
		assertThat(result).isEqualTo("");
		
	}
	

	@Test
	public void whenNonRepeatedThenReturnChar3(){
		
		String s1 = "aba";
		String result = classicProblemsStrings.firstNonRepeatedCharInString(s1);
		assertThat(result).isEqualTo("b");
		
	}
	
	@Test
	public void whenNonRepeatedThenReturnChar4(){
		
		String s1 = "abab";
		String result = classicProblemsStrings.firstNonRepeatedCharInString(s1);
		assertThat(result).isEqualTo("");
		
	}
	
	@Test
	public void whenNonRepeatedThenReturnChar5(){
		
		String s1 = "ababccdeedfg";
		String result = classicProblemsStrings.firstNonRepeatedCharInString(s1);
		assertThat(result).isEqualTo("f");
		
	}
	
	//////////////////////////////////////
}
