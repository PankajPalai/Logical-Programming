package com.pk.pattern;


/*
 * 
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 
 

 */

public class Test02CharacterPttern {

	public static void main(String[] args) {
		for(int i=65;i<=70;i++) {
			for(int j=65;j<=i;j++) {
				System.out.print(" "+(char)i);
				
				
			}
			System.out.println();
			
		}
		

	}

}
