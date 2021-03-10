package com.pk.array;

public class PassingAndReturningArray {

	public static void main(String[] args) {
		int[] ia= {10,3,15,8,16};
		passingArrayFindMin(ia);
		int [] ia2=returnArray();
		for(int i:ia2) {
			System.out.println(i);
			
		}

	}

	private static int[] returnArray() {
		int[] ia= {10,3,15,8,16};
		int max=0;
		max=ia[0];
		for(int i=0;i<ia.length;i++) {
			
		if(max<ia[i]) {
			max=ia[i];
		}
		}
		return ia;
		
	}

	private static void passingArrayFindMin(int[] ia) {
		int min=0;
		min=ia[0];
		for(int i=0;i<ia.length;i++) {
			if(min>ia[i]) {
				min=ia[i];
			}
			
		}
		System.out.println("smallest element is :"+min);
		
	}
	
	

}
