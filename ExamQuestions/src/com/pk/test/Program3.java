package com.pk.test;

/*
 * Compilation Error
Fix getUserName so that it returns the user’s name as "LastName, FirstName" (without the quotes).

Capitalise the first letter of the first and last names

If the lastname is null, just return firstname without a comma

e.g. "John" "Smith" should return "Smith, John
 */

public class Program3 {
	
	public static void main(String[] args) {
		System.out.println(getUserName("pankaj", "palai"));
	}
    public static String getUserName (String firstName, String lastName) {
		return capitaliseFirstLetter(firstName)+", "+capitaliseFirstLetter(lastName);
        // return the user name as LastName, FirstName e.g. Smith, John
    }
   
    
    public static String capitaliseFirstLetter (String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
            
        char[] chars = s.toCharArray();
        
        chars[0] = Character.toUpperCase(chars[0]);
        
        return String.valueOf(chars);
    }       
}