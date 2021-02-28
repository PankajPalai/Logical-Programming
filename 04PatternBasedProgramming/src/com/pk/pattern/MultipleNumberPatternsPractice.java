package com.pk.pattern;

public class MultipleNumberPatternsPractice {

	public static void main(String[] args) {
		//example 1
		/*
		 *    *****
		 *    *****
		 *    *****
		 *    *****
		 *    *****
		 
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	
	*/
		
		//example 2
		
	/*
	 *    1
	 *    12
	 *    123
	 *    1234
	 *    12345
	 
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
			
		}
		
		*/
		
		//example 3
		/**
		 *   5
		 *   54
		 *   543
		 *   5432
		 *   54321
		 * 
		 
		
		for(int i=5;i>0;i--) {//5 4 3 2 1
			for(int j=5;j>=i;j--) { //5
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		*/
		
		//example4
		
		/*
		 *   54321
		 *   4321
		 *   321
		 *   21
		 *   1
		 

		for (int i = 5; i >=1 ; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		*/
		
		//example 5
		
		/*
		 *   54321
		 *    4321
		 *     321
		 *      21
		 *       1
		 *     
		 
		
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
			
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		*/
		
		
		//example 6
		
		/**
		 *   55555
		 *   4444
		 *   333
		 *   22
		 *   1
		 
		
		for(int i=5;i>=1;i--) { //54321
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		*/
		//example 7
		
				/**
				 *   11111
				 *   2222
				 *   333
				 *   44
				 *   5
				 */
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
