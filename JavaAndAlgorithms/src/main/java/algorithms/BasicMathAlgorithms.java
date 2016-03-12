package algorithms;


public class BasicMathAlgorithms {
	
	
	//////////////////////////////// factorial
	
	public int factorialIterative(int number){
		
		int aux = 1;	
		for(int n=1;n  < number; n++){
			aux = (n + 1) * aux; 
		}	
		return aux;
	}
	
	public int factorialRecursive(int number){
		
		if(number == 1 || number == 1){
			return 1;
		}
		
		return number * factorialRecursive(number-1) ;
	}
	
	/////////////////////////////// fibonacci  F_n = F_{n-1} + F_{n-2}, F_1 = 1,\; F_2 = 1. 
	
	//Print the n first fibonacci numbers in interactive way
	public String fibonacciIterative(int n){
		
		StringBuilder sequence = new StringBuilder();	
		int accumulator1 = 1;
		int accumulator2 = 1;
		
		for(int i=1;i  <= n; i++){
			
			if (i == 1 || i == 2){
				sequence.append("1,");
			}else{
				int r = accumulator1 + accumulator2;
				accumulator1 = accumulator2;
				accumulator2 = r;
				sequence.append(r + ",");
			}
		}
		
		return sequence.substring(0, sequence.length() - 1);
	}
	
	
	//Print the n first fibonacci numbers in recursive way
	public String fibonacciNNumbers(int n){
		StringBuilder sequence = new StringBuilder();
		for(int i=1;i <= n;i++){
			sequence.append(fibonacciRecursive(i) + ",");
		}
		return sequence.substring(0, sequence.length() - 1);
	}
	
	
	private int fibonacciRecursive(int n){
		if(n <= 1){
			return n;
		}	
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
	
	
	
}

