package com.pk.sp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*develope an application that compares strings lexicographically,
 * 
 * we need to take the support of compareTo() method.
 * it compares ascii value of characters of  both strings and returns
 *  difference between the ascii values of characters.
 *  
 *  public int CompareTo(String str) it is a method declared in Comparable interface,
 *  String class is subclass of Comparable interface,
 *  so string class provide implementation of compareTo() methods.
 *   	str1.compareTo(str2)
 *      Returns 0 :if both the strings have equals character  and equal length(Ret : len(s1)-len(s2))
 *      Returns >0:if asci value of chareacter in str1 > ascii value of characters in str2
 *      Returns <0:if asci value of str1 < ascii value of str2


note: space string/ emty char value is 32
 *      

*/
//develope an application to arrange strings in ascending order
public class Test051_CompareStringLexicographicallyTestCases {

	public static void main(String[] args) {
		System.out.println("largest :" + checkLexicoGraphicalyGreater("ade", "azb", "abc"));

	}

	private static String checkLexicoGraphicalyGreater(String str1, String str2, String str3) {

		String largest = "";

		if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0){
			System.out.println(str1 + " compared with " + str2 + " and returns :" + str1.compareTo(str2));
			System.out.println(str1 + " compared with " + str3 + " and returns :" + str1.compareTo(str3));
				largest = str1;

				return largest;
			}
		

		else if (str2.compareTo(str3) > 0) {
			System.out.println(str2 + " compared with " + str3 + " and returns :" + str1.compareTo(str3));

			
			largest = str2;
		}
		else

			largest=str3;
		
		
		return largest;

	}
}

