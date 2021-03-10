package com.pk.np;

public class Test12_LcmAndHcf {

	public static void main(String[] args) {
		findHcf(10,15);
		findLcm(10,15);
		
	}

	private static void findLcm(int num1, int num2) {
		int largest=0;
		largest=num1>num2?num1:num2;
		
		for(int i=1;i<=largest;i++) {
			//System.out.println("i "+i+" num:"+num2);
			if(largest%num1==0 && largest%num2==0) {
				System.out.println("LCM :"+largest);
				break;
				
			}
			largest++;
			
		}
	}


	
	

	private static void findHcf(int num1, int num2) {//2,3
		int largestFactor=0;
		int largest=0;
		largest=num1>num2?num1:num2;
		
		for(int i=1;i<=largest;i++) {
			//System.out.println("i "+i+" num:"+num2);
			if(num1%i==0 && num2%i==0) {
				largestFactor=i;
							
			}
		}
		System.out.println("GCD :"+largestFactor);
	}
	
}

