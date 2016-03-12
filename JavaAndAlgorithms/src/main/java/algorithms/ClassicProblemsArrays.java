package algorithms;

public class ClassicProblemsArrays {
	
	public String[] rotateAnArray(String[] entrypoint){
		
		String[] result = new String[entrypoint.length];
		
		for(int x = 0; x <= entrypoint.length-1; x++){
			result[entrypoint.length - 1- x] = entrypoint[x];
			}
		
		return result;
	}

}
