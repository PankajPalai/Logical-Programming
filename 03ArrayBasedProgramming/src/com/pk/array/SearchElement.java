package com.pk.array;

import java.util.Scanner;

public class SearchElement {
//search for an element in an array
	public static void main(String[] args) {

		int[] ia = { 10, 15, 12, 18, 16 };
		// search by element

		// taking boolean variable to store false if ele is not there else store true
		boolean found = false;
		int index=0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element  :");
		int ele = sc.nextInt();
		for (int i = 0; i < ia.length; i++) {
			if (ele == ia[i]) {
				found = true;
				index=i;
				break;

			}
			else {
				found = false;
			}
			
		}
		if (found)
			System.out.println(ele + " is found in the array at index :"+index);
		else
			System.out.println(ele + " is not found in the array");

	}

}
