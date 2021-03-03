package com.pk.array;

import java.util.Scanner;

public class RetrieveElement {
//search for an element in an array
	public static void main(String[] args) {
		
		int [] ia= {10,15,12,18,16};
		//search by index
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter index number :");
		int index=sc.nextInt();
		if(index < 0 || index >=ia.length) {
			throw new IndexOutOfBoundsException(" please input index in between 0 and "+ia.length);
		}
		System.out.println("ia["+index+"] :"+ ia[index]);
		
	}
	
	

}
