package com.pk.sp;

/*this  application shows how many ways we can compare the string and 
in which situation we need to compare string.

we can compare string for two approach
1. compare string object using reference
2.compare string object using data

 differenct ways to compare string is ==,equals(),equalsIgnoreCase(),contentEquals()
*/
public class Test04_CompareString {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String str = "ABC";
		// 1.compare two string using reference
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// false
		/**
		 * true because of string pooling, s2 pointing to the same reference
		 */

		// 2.compare two strings based on data
		// (it is Case Sensitive:: upperCase and Lowercase letters are different)

		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(str));// false: as it compares two string with case sensitve data
		/**
		 * -->first it compares two strings using reference if matched then, -->it
		 * compares types of two strings if compatible then, -->it compare two strings
		 * based on data since toString() is Overriden in String class to compare string
		 * using data.
		 */
		// 3.Compare two strings where case doesnt matter using equalsIngnorecase()

		String s4 = "abc";
		String s5 = "Abc";

		System.out.println(s4 == s5);// false : as it compares reference
		System.out.println(s4.equals(s5));// false as it compares character having matching cases :
		System.out.println(s4.equalsIgnoreCase(s5));// true as it ignore the case sensitive

		/*
		 * case sensitive:'a'(ASCII VALUE:97) and 'A'(ASCII VALUE:65) are different
		 * 
		 * to know ascii value of any character use System.out.println((int)'char');
		 * eg:System.out.println((int)'a');// it will return 97
		 * 
		 */

		// 4.compare String based on data with StringBuilder and StringBuilder
		/**
		 * we can create string object using String,StringBuffer,StringBuilder
		 * remember:String ,StringBuffer.StringBuilder are incompatible with each each
		 * others and there is no relation between String ,StringBuffer.StringBuilder
		 */

		String st = "xyz";
		StringBuffer sbf = new StringBuffer("xyz");
		StringBuilder sbd = new StringBuilder("xyz");
		// 1.System.out.println(st==sbf);
		// CError:incompatible types == cant compare incompatible types
		System.out.println(st.equals(sbf));// return false,
		System.out.println(st.equals(sbd));// return false,

		// we can compare tow incompatibe types using equals() but if we compare two
		// incompatible types using equals() it always returns false.

		/*
		 * then how we compare these ,is it really possible ? yes lets see below code
		 * 
		 */
		System.out.println(st.equals(sbf.toString()));// true
		System.out.println(st.equals(sbd.toString()));// true

		/*
		 * upto java 1.3 v we compare like this. but it doesnt seems userfriendly as
		 * calling two methods in same line
		 * 
		 * but in java 1.4v one method added to compare String and StringBuffer but not
		 * with StringBuilder
		 */
		System.out.println(st.contentEquals(sbf));// retrun true

		/*
		 * 
		 * boolean java.lang.String.contentEquals(StringBuffer sb) in java 1.4v a new
		 * method added to String
		 * 
		 * 
		 * Compares this string to the specified StringBuffer. The resultis true if and
		 * only if this String represents the samesequence of characters as the
		 * specified StringBuffer.
		 */

		/**
		 * the how to compare String data with StrinBuilder data ?
		 * 
		 * wait! wait! wait! dont worry! James Gosling will do something for you
		 * 
		 * boolean java.lang.String.contentEquals(CharSequence cs)
		 * add in java 1.5 v
		 * 
		 * 
		 * Compares this string to the specified CharSequence. Theresult is true if and
		 * only if this String represents thesame sequence of char values as the
		 * specified sequence. 
		 * 
		 */
		System.out.println(st.contentEquals(sbd));
		
		//and do you know it will compare String with sbf and sbd also
		
		/*
		 * Thank you for reading this article.
		 * I am Pankaj Palai from Odisha.(MCA[2017-2020])
		 * 
		 * This is my first article, i havent written any articles in my life.
		 * i am enthusiastic about java.
		 * to connect with me
		 * email: pankajpalai405@gmail.com
		 * GitHub:  https://github.com/PankajPalai
		 * Linkedin: https://www.linkedin.com/in/pankajpalai/
		 */

	}

}