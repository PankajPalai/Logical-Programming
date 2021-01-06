package com.nt.pk.np;

import java.util.Scanner;

//swap two numbers  using third variable
public class LargestNumber1 {

	public static void main(String[] args){
		int a=10;
		int b=5;
		int c=20;
		int largest=0;
		if(a>b) {
			if(a>c) {
				largest=a;
			}
			else {
				largest=c;
			}
			
		}
		if(b>c) {
			largest=b;
		}
		else {
			largest=c;
		}
		System.out.println("largest "+largest);
	}
}