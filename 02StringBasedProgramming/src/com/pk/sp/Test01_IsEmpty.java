package com.pk.sp;

/*this application is developed to check whether a string is empty or not and blank or not
 * we can differentiate the difference betwwen empty() an blank()
 *  */

//try all the test cases with all permutations and combination

public class Test01_IsEmpty {

	public static void main(String[] args) {
		String s1 = "";// length=0
		String s2 = null;
		String s3 = " ";// length=1

		System.out.println(s1.isEmpty());
		/*
		 * Returns true if, and only if, length() is 0. Returns:true if length() is 0,
		 * otherwise false Since:1.6
		 */
		System.out.println(s1.trim().isEmpty());// upto java 11
		System.out.println(s1.isBlank());// java 11 onwards

		/*
		 * Returns:true if the string is empty or contains only white space
		 * characters,otherwise false
		 * 
		 * blank={empty,white space character,space} Since:11
		 */
		System.out.println();
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		System.out.println(s3.trim().isEmpty());

		System.out.println(s1.length());
		System.out.println(s3.length());
		System.out.println();
		String s4 = "\n";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
		System.out.println(s4.length());

		// System.out.println(s2.isBlank()); nullpointer exception will raised as we
		// cant call any method without reference

		// let us call our method having our logic like isEmpty() and isBlank

		System.out.println(isThisEmpty(s1));
		System.out.println(isThisBlank(s1));

	}

	private static boolean isThisEmpty(String str) {
		if (str.length() == 0)
			return true;
		else
			return false;

	}

	private static boolean isThisBlank(String str) {
		if (str.length() == 0 || str == " ")
			return true;
		else if (str == "/n" || str == "/t" || str == "\f" || str == "\r")
			return true;
		else
			return false;

	}

}
