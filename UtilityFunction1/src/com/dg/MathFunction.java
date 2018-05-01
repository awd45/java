package com.dg;

public class MathFunction {
	
//	public static double dgRound(Double targetValue, int sequence){	
//		
//		//Fill the logic
//		double decimal = Math.pow(10, sequence);
//		double returnValue = Math.round(targetValue*decimal)/decimal;
//		
//		return returnValue;
//	}
	
	
	public static void main(String[] args) {
		
//		double testValue = 12.23522;
//		double answer = dgRound(testValue,2);
//		
//		System.out.println("hello world answer is "+answer);
	}

	public static int getWeekInfo(String inputValue){
		int result = Integer.parseInt(inputValue.substring(4));
		
		return result;
	}
}


