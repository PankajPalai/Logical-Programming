package com.pk.np;

/*
 *Find factorial of a given number, it will helpful to find strong number in next programs
 */
public class Test02_FindFactorial {

	public static void main(String[] args) {
		
		System.out.println(findFactorial(6));
	
		
		
	}

	private static int findFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {//1..5
			fact=fact*i;	//num=5*1,5*2	
		}
		return fact;
	}
		
	}


