package com.pk.test;

/*
 * find duplicate character in a given ching and find its no. of occurences
 */
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findDuplicates("pankaj palai");

	}

	private static void findDuplicates(String s1) {
		int[] freq = new int[s1.length()];
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			freq[i] = 1;
			for (int j=i+1; j <ch.length; j++) {
				
				if (ch[j] == ch[i]) {
					freq[i]++;
					
					ch[j] = ' ';

				}
				
				

			}
		}
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ' && ch[i]!='\0') {
			System.out.println("Frequency of :"+ch[i]+" ="+freq[i]);
			}
		}

	}

}
