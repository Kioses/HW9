package main;

public class Calculator {
	
//	public static void main(String[] args) {
//		System.out.println(divide(2,0));
//	}

	public int add(int valueOne, int valueTwo) {
		return valueOne + valueTwo;
	}
	
	public int sub(int valueOne, int valueTwo) {
		return valueOne - valueTwo;
	}
	
	public int multiply(int valueOne, int valueTwo) {
		return valueOne * valueTwo;
	}
	
	public float divide(int numerator, int denominator) {
		
		if (denominator == 0) {
			
			throw new ArithmeticException("ZeroDivisionError");			
		} else {
			return (float) numerator / denominator;
		}
			

	 
	}
}