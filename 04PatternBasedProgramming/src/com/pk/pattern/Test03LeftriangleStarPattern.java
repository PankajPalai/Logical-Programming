package com.pk.pattern;

/*
 *            *
 *       	 **
 *       	***
 *         ****
 *        *****
 */
public class Test03LeftriangleStarPattern {

	public static void main(String[] args) {
		{
			// i for rows and j for spaces
			//and k for printing *
			// row denotes the number of rows you want to print
			// Outer loop work for rows
			for (int i = 0; i <= 6; i++) {
				// inner loop work for space
				for (int j = 6; j >= i; j--)

				{
					// prints space between two stars
					System.out.print(" ");
				}
				// inner loop for columns
				for ( int k= 0; k <= i; k++) {
					// prints star
					System.out.print("*");
				}
				// throws the cursor in a new line after printing each line
				System.out.println();
			}

		}
	}

}
