package com.pk.np;

/*
 * largest of 3 integer with and without using conditional operator
 */
public class Test09_LargestNumber {

	public static void main(String[] args) {
		
		findLargest(300,55,50);
	


	}
/*with using conditional operator
	private static void findLargest(int num1, int num2, int num3) {
		int largest=num1>num2?num1:num2>num3?num2:num3;//30>55 ?30:55>50?55:50
		System.out.println(largest);
		
		
	}
	
	*/
	
	//without using conditional operator
	private static void findLargest(int num1, int num2, int num3) {
		int largest=0;
		if(num1>num2 && num1>num3) {
			largest=num1;
			
		}
		else if(num2>num3 )
			largest=num2;
		else 
			largest=num3;
		
		System.out.println(largest);
	}
	
	
	
}
