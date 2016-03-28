package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassicProblemsArrays {
	
	public String[] rotateAnArray(String[] entrypoint){
		
		String[] result = new String[entrypoint.length];
		
		for(int x = 0; x <= entrypoint.length-1; x++){
			result[entrypoint.length - 1- x] = entrypoint[x];
			}
		
		return result;
	}
	
	public int[] removeDupsIntArray(int[] inputArray){
		if(inputArray == null)
			return new int[]{};
		else{
			
			Arrays.sort(inputArray);
			return removeDupsSortedArray(inputArray);
		}	
	}
	
	private int[] removeDupsSortedArray(int[] inputArray){
		List<Integer> tmp = new ArrayList<>();
		for(int i = 0; i < inputArray.length;i++){	
			if( i == (inputArray.length - 1)){
				tmp.add(inputArray[i]);
				break;
			}
			else if(inputArray[i] == inputArray[i + 1]){
				continue;
			}
			else{
				tmp.add(inputArray[i]);
			}
		}
		return tmp.stream().mapToInt(i->i).toArray();
	}

	
}
