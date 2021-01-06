package com.nt.pk.np;

import java.util.Scanner;

public class LargestNumber2 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=54;
		int d=9;
		int e=83;
		int f=58;
		
		//int largest=a>b?a:b;
		//int large=c>largest?c:largest;
		int largest=a>b?(a>c?a:c):(b>c ?b:c);//a>b?(a>c?a:c):(a>d?a:d) <= c ? (c>d?c:d) : (b>d?b:d)
		
		int large2=(a>b && a >c && a>d)?a:((b>c && b>d)?b:(c>d?c:d));
		int large3=(a>b && a>c && a>d && a>e)?a:(b>c && b>d && b>e)?b:(c>d && c>e)?c:(d>e?d:e);
		int large4=(a>b && a>c && a>d && a>e && a>f)?a:(b>c && b>d && b>e && b>f)?b:(c>d && c>e && c>f)?c:(d>e && d>f)?d:(e>f?e:f);
		
		System.out.println("largest number "+" among 10,5 and 54  is  :"+largest);
		System.out.println("largest number "+" among 10,5 and 54 and 28 is  :"+large2);
		System.out.println("largest number "+" among 10,5 and 54 and 28 is  :"+large3);
		System.out.println("largest number "+" among 10,5 and 54 and 28 is  :"+large4);
		
	}

}
