package com.pk.sp;
//find length of a string using your own logic without using predefined method
public class Test02_LengthOfString {

	public static void main(String[] args) {
		System.out.println(findLength("pankaj"));
		System.out.println(findLength(" "));
		System.out.println(findLength("null"));
		//System.out.println(findLength(null));
		System.out.println(findLength(""));
		System.out.println(findLength("\n"));
		System.out.println(findLength("/n"));
		System.out.println(findLength("0"));
		//predefined method
		System.out.println("pankaj".length());


	}

	private static int findLength(String str) {
		char[] ch=str.toCharArray();
		
		return ch.length;
	}
}