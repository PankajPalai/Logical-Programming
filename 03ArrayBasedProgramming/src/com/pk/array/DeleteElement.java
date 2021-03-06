package com.pk.array;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class DeleteElement {
	public static void main(String[] args) {
		
		int [] ia= {10,15,12,18,16};
		int ele=15;
		System.out.println("before deletion ia[] with length :"+ia.length);
		for(int i:ia) {
			System.out.println(i);
		}
		//remove element
		for(int i=0;i<ia.length-1;i++) {
			if(ia[i]==ele) {
				ia[i]=ia[i]+1;
				
			}
		
		}
		System.out.println("after deletion ia[] with length :"+ia.length);
		for(int i:ia) {
			System.out.println(i);
		}
		
		
	
	}
	
	

}
