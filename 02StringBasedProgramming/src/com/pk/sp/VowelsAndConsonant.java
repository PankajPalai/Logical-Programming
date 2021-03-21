package com.pk.sp;

/*in all string based programming i will develope two opertaions by using predefined function to find the solution and 
by using our own method to find the solution of the program.
 */

public class VowelsAndConsonant {

	public static void main(String[] args) {
		countVowsAndCons("pAnkAj palai");

	}

	private static void countVowsAndCons(String str) {
		
		//removing spaces and converting everything to lowercase so that won't  compare uppercase and lowercase 
		//since both upper case and lower case letters are same in case of vowels and consonansts.
		str=str.replace(" ","").toLowerCase();
		int vowelCount = 0;
		int consCount = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				System.out.println("ch["+i+"]"+ " == "+ch[i]);
				vowelCount++;

			} else {
				consCount++;
			}
			
		}
		System.out.println(" vowels :"+vowelCount+" Consonants :"+consCount);


	}

	/*
	 * private static void countVowsAndCons(String str) { for(int
	 * i=0;i<str.length();i++) { if(str(str.charAt(i)) =='a' || 'e' || 'i' || 'o' ||
	 * 'u') {
	 * 
	 * } }
	 */

}
