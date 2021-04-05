package com.pk.sp;
/**
 * 
 * @author Pankaj Palai
 * 
 * this application is developed to search for a character/string in a given String 
 * if available or not( returns true or false)
 * 
 public boolean contains (Charsequence cs)
 *  are useful to search the String and return true if available esle returns false
 *  This method is available since java 1.5v
 *  
 *  we can pass only only Subclass object of Charsequence to the argument
 *  ie: we can pass either /string/StringBuffer/StringBuilder object  as argument
 *  it is not allowing character to take as argument
 *
 */
public class Test07SearchingForCharacter {

	public static void main(String[] args) {
		
String s2="Life is a Race , so run fast";	
System.out.println(s2.contains("a"));//true
System.out.println(s2.contains("race"));//return false as it is case sensitve 
//"Race" and "race" borh are different

System.out.println(s2.toLowerCase().contains("race"));//returns true

/*
 * here before searching we are converting the string to lower case then searching the string.
that is calling toLowerCase() will make the string as "life is a race ,so run fast"
then it will search for "race" in the new string and hence returns true
*/

//lets make our own logic to search for the string

char[] ch=s2.toCharArray();
String str="race";

for(int i=0;i<ch.length;i++) {
	if('R'==ch[i]) {
		System.out.println("available");
		System.out.println("index :"+i);
		
		
	}
	
	
	
}

		
		

	}

}
