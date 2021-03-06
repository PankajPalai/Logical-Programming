package com.pk.array;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SortDescending {
	public static void main(String[] args) {
		
		int [] ia= {10,15,12,18,16};
int temp=0;
		
		System.out.println("initial array :"+ia.length);
		for(int i:ia) {
			System.out.println(i);
		}
		
		for(int i=0;i<ia.length;i++) {
			for(int j=i+1;j<ia.length;j++) {
				if(ia[i]<ia[j]) {
					temp =ia[i];
					ia[i]=ia[j];
					ia[j]=temp;
				}
				
				
			}
			
			
		}

		System.out.println("array after sorting :");
		for(int i:ia) {
			System.out.println(i);
		}
		
	
		
	
	}
	
	

}
