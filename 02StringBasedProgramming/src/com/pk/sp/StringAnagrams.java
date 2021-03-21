package com.pk.sp;

import java.util.Arrays;

/*
 * Develope an application to check whether two strings are anagrams or not.
 * 		:Two string are called anagrams if a word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp
 * 
 * 		:Two words are said to be anagrams if both the words contain the same set of characters with all original letters exactly once.
 * 			 For example, the word program can be re-arranged as grampor and these both words form an anagram.
 */

public class Test03_StringAnagrams {

	public static void main(String[] args) {
		System.out.println(checkAnagrams("pankj","ankjp")?"anagrams":"not anagrams");

	}

	private static boolean checkAnagrams(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		//convert into character arrays
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		//sort to charachter arrays
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		
		
		for(int i=0;i<ch1.length;i++) {//0 to 5
			for(int j=0;j<ch2.length;j++) {//0 to 5
				if(ch1[i]!=ch2[i]) {
					return false;
					
				}
			}
			
		}
		return true;
		
		
	}

	

}
