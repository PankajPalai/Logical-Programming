package com.pk.np;

/*
 * .swap two num with and without using third variables with various logics
 */
public class Test08_SwapTwoNumbers {

	public static void main(String[] args) {
		
	//	swapW(5,6);
		swapWO(1000,1500);
		


	}
	
	//swap without third variable
private static void swapWO(int num1, int num2) {//20,10
	System.out.println("before swapping : num1 ="+num1+ " and num2 ="+num2);
	/*
	 * Logic 1
	 * num1=num1+num2;//30
	num2=num1-num2;//10
	num1=num1-num2;
	*/
	/*
	 * logic 2
	 
	num1=num1*num2;//200
	num2=num1/num2;//20
	num1=num1/num2;//10
	
	*/
	num1=num1^num2;
	num2=num1^num2;
	num1=num1^num2;
	
	
	
	
	
	
	
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
