package com.pk.sp;
/**
 * 
 * @author Pankaj Palai
 * 
 * this application is developed to search for a character/string in a given String 
 * if available then return the location where it is available.
 * 
 * public int indexOf(CharSequence cs) 
 * and
 *  public int indexOf(String str)
 *  are useful to search the character /String and returns its index.
 *  This method is available since java 1.0v
 *
 */
public class Test06SearchingForIndexOfCharacter {

	public static void main(String[] args) {
		
		String s1="Hey pankaj, How are you";
		System.out.println("length :"+s1.length());
		System.out.println(s1.indexOf('a'));//5
		//search for character 'a' from index-0 to index[length-1]
		System.out.println(s1.indexOf("pankaj"));//4
		//search for string "pankaj" from index-0 to index[length-1]
		System.out.println(s1.lastIndexOf("a"));
		//search for character 'a' from last indexindex[length-1] to index:0 
		
		System.out.println(s1.indexOf('a', 10));//16
		//search for character 'a' from index-0 to index[length-1]

		System.out.println(s1.lastIndexOf('a',10));//8
		//search for character 'a' from index:10 to index:0 (backward searching)
		
		
		
		
		
		

	}

}
