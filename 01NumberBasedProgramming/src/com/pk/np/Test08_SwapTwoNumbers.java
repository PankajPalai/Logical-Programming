package com.pk.np;

/*
 * .swap two num with and without using third variables
 */
public class Test08_SwapTwoNumbers {

	public static void main(String[] args) {
		
	//	swapW(5,6);
		swapWO(10,20);
		


	}
	
	//swap without third variable
private static void swapWO(int num1, int num2) {//10,20
	System.out.println("before swapping : num1 ="+num1+ " and num2 ="+num2);
	num1=num2;
	num2=num1;
	
	
	
	
	System.out.println("after swapping : num1 ="+num1+ " and num2 ="+num2);


	
		
	}
//swapping using third variables
	private static void swapW(int num1, int num2) {//5,6
		System.out.println("before swapping : num1 ="+num1+ " and num2 ="+num2);
		
		int thirdVar=num1;
		num1=num2;
		num2=thirdVar;
		
		
		System.out.println("after swapping : num1 ="+num1+ " and num2 ="+num2);
		
	}

}
