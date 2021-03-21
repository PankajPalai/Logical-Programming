package com.pk.sp;

/*in all string based programming i will develope two opertaions by useing predefined function to find the solution and 
by using our own method to find the solution of the program.
*/

public class CountCharacters {

	public static void main(String[] args) {
		countChar1("pankaj");
		countChar2("palai");

	}

	

	private static void countChar1(String str) {
		int count=str.length();
		System.out.println("length :"+count);
		
	}
	private static void countChar2(String str) {
		char[] ch=str.toCharArray();
		System.out.println("length :"+ch.length);	
		
	}

}
