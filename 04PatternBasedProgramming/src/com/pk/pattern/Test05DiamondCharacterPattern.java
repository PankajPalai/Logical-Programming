package com.pk.pattern;


/*
     A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A
     
 */

public class Test05DiamondCharacterPattern{

	public static void main(String[] args) {
		
		
		
		for(int i=65;i<=70;i++) {
			for(int s=70;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=65;j<=67;j++) {
				System.out.print(" "+(char)i);	
				
			}
			System.out.println();
		}
		

	}

}
