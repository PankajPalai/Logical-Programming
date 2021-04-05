package com.pk.pattern;

/*
 *            *
 *       	 * *
 *       	* * *
 *         * * * *
 *        * * * * *
 *        
 *        
 *        -----*
 *        ----*-*
 *        ---*-*-*
 */
public class Test04PyramidStarPattern {
	
	public static Boolean checkEven(int num){
		if(num%2==0) {
			return true;	
		}
		else return false;
		
		
	}

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {//i=1  || i=2
			for(int j=4;j>=i;j--) {//j=4 to i means  j=4,3,2,1=>4 spaces in first line || j=4 to  2 =>3 spaces in 2nd line
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {//k=1 to i means k=1 1 space and 1 star in first line itself || k=1 to 2 ==>  2 times 1 space and star in 2nd line 

				if(checkEven(k)) {
					System.out.print("#");
				}
				System.out.print(" * ");
				
			}
			
			System.out.println(); //cursor moves to next line
		}
		
		
		
		
		
	}
		
	}


