package com.nt.pk.np;
/*
 * Armstroing number is a number where cube of each digits sum is equals to the number itself.
 */
public class ArmstrongNumberTest {

	public static void main(String[] args) {
	//	checkArmstrong(407);
		printArmstrong(1,1000);
		printArmstrong2(1,1000);
		printArmstrong3(1,1000);
	}
	
	
	private static void printArmstrong(int startRange, int endRange) {
		long time1=System.nanoTime();
		System.out.println("ArmStrong numbers between "+startRange+" and "+endRange);
		for(startRange=1;startRange<=endRange;startRange++) {
			int num=startRange;
			int rem=0;
			int sum=0;
			int cube=0;
			while(num>0) {
				rem=num%10;
				cube=rem*rem*rem;
				sum=sum+cube;
				num=num/10;			
			}
			if(sum==startRange) {
				System.out.println(startRange);
			}
		}
			
		long time2=System.nanoTime();
		long timeDif1=time2-time1;
		System.out.println("time diff1 pk :"+timeDif1);
	}

	

	

	private static void printArmstrong2(int startRange, int endRange) {
		long time3=System.nanoTime();
		System.out.println("ArmStrong numbers between "+startRange+" and "+endRange);
		for(int i=startRange;i<=endRange;i++) {
			int num=i;
			int rem=0;
			int sum=0;
			int cube=0;
			while(num>0) {
				rem=num%10;
				cube=rem*rem*rem;
				sum=sum+cube;
				num=num/10;			
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
		
		
		long time4=System.nanoTime();
		long timeDif2=time4-time3;
		System.out.println("time diff2 h:"+timeDif2);
			
		
	}
	
	private static void printArmstrong3(int startRange, int endRange) {
		long time5=System.nanoTime();
		System.out.println("ArmStrong numbers between "+startRange+" and "+endRange);
		for(int i=startRange;i<=endRange;i++) {
			
			if(checkArmstrong(i)) {
				System.out.println(i);
			}
		}
		
		
		long time6=System.nanoTime();
		long timeDif3=time6-time5;
		System.out.println("time diff3 :"+timeDif3);
			
		
	}
	
	/**
	 * 
	 * @param num
	 * @return
	 */

	private static boolean checkArmstrong(int num) {//153
		int temp=num;	//temp=153
		int rem=0;		//rem=0
		int sum=0;		//sum=0
		int cube=0;		//cube=0
		while(num>0) {		//num>0
			rem=num%10;
			cube=rem*rem*rem;
			sum=sum+cube;
			num=num/10;			
		}
		if(sum==temp) {
			//System.out.println(temp+ " is an armstrong number");
			return true;
		}
		else {
			//System.out.println(temp+ " is not an armstrong number");
			//return false;
		}
		
		return false;
		
		
	}

}
