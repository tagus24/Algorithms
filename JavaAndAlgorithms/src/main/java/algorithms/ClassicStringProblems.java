package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ClassicStringProblems {
	
	public String getDuplicateCharacters(String toProcess){
		
		StringBuilder result = new StringBuilder("");
		
		if(toProcess != null){
			Map<Character, Integer> charMap = new HashMap<Character, Integer>();
			char[] arrayCharacts = toProcess.toCharArray();
			
			for(int index = 0; index < arrayCharacts.length; index++){
				if(charMap.get(arrayCharacts[index]) == null || 
						(charMap.get(arrayCharacts[index]) == 0)){
					
					charMap.put(arrayCharacts[index], 1);
				}else if(charMap.get(arrayCharacts[index]) == 1){
					charMap.put(arrayCharacts[index], 2);
					result.append(arrayCharacts[index]).append(arrayCharacts[index]);
				}
			}
		}
		return result.toString();
	}
	
	
	public boolean verifyIfStringsAreAnagrams(String s1, String s2){
		
		boolean result = false;
		String s1WithoutSpaces = s1.replaceAll("[-+.^:, ]","");
		String s2WithoutSpaces = s2.replaceAll("[-+.^:, ]","");
		char[] s1Characs = s1WithoutSpaces.toCharArray();
		char[] s2Characs = s2WithoutSpaces.toCharArray();
		Arrays.sort(s1Characs);
		Arrays.sort(s2Characs);
		String finalS1 = new String(s1Characs);
		String finalS2 =  new String(s2Characs);
		
		if(finalS1.equals(finalS2))
			result = true;
		
		return result;
	}
	
	
	public String firstNonRepeatedCharInString(String input){
		
		String result = "";
	
		if(input != null){
			
			LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
			char[] tokens= input.toCharArray();
			for(Character tok : tokens)
				if(map.get(tok) == null){
					map.put(tok, 1);
				}else{
					Integer value = map.get(tok);
					map.put(tok, ++value);
				}
			
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				Character key = entry.getKey();
			    Integer value = map.get(key);
			    if(value == 1){
			    	result = String.valueOf(key);
			    	break;
			    }
			}
		}
		return result;
		
	}
	
	
	public String reverseString(String s){
		return s != null?new StringBuilder(s).reverse().toString():"";
	}
	
	//////////////////////////////////////////
	
	public int countNumberOfConsoants(String s){
		
		return s != null?s.replaceAll("[aeiouAEIOU]","").length():0;
		
	}
	
	public int countNumberOfVowels(String s){
		
		return s != null?s.replaceAll("[a-z&&[^aeiou]]","").length():0;
		
	}

}
