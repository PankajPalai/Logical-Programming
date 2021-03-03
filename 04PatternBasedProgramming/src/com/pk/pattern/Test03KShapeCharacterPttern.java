package com.pk.pattern;


/*
 * 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
 */

public class Test03KShapeCharacterPttern{

	public static void main(String[] args) {
		for(int i=70;i>=65;i--) {
			for(int j=65;j<=i;j++) {
				System.out.print(" "+(char)j);		
			}
			System.out.println();
			
		}
		
		for(int i=65;i<=70;i++) {
			for(int j=65;j<=i;j++) {
				System.out.print(" "+(char)j);	
				
			}
			System.out.println();
		}
		

	}

}
