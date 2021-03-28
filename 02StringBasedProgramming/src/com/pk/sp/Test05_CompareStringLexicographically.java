package com.pk.sp;

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
 *      Returns >0:if asci value of str1 > ascii value of str2
 *      Returns <0:if asci value of str1 < ascii value of str2

 *      

*/
public class Test05_CompareStringLexicographically {

	public static void main(String[] args) {
		/*	
		 *//**
			 * compareTo method internal logic
			 * 
			 * public int compareTo(String s1,String s2) for(int i=0;i<minLength;i++){
			 * if(s1.charAt(i)!=s2.charAt(i))
			 * 
			 * return s1.charAt(i)-s2.charAt(i)//97-65=32
			 * 
			 * else return s1.length-s2.length
			 */

		String s1 = "abc";
		String s2 = "abc";
		String s3 = "Abc";
		String s4 = "abcdef";
		String s5 = "abcDEF";
		/**
		 * lets first compare using predefined method
		 */
		System.out.println(s1.compareTo(s2));// ret:0 means equals
		System.out.println(s1.compareTo(s3));// 32
		System.out.println(s3.compareTo(s1));// -32
		System.out.println(s1.compareToIgnoreCase(s3));// 0
		System.out.println(s3.compareToIgnoreCase(s1));// 0
		System.out.println(s1.compareTo(s4));// -3
		System.out.println(s4.compareTo(s1));// 3
		System.out.println(s1.compareTo(s5));// -3
		System.out.println(s5.compareTo(s1));// 3
		String s6 = "acb";
		System.out.println(s1.compareTo(s6));// -1
		System.out.println(s6.compareTo(s1));// 1

	}

}