
package com.nt.pk.np;
import java.util.Scanner;
//develope a program to check whether a number is strong number or not
// sum of factorials of each digit equals to the given number then the number is called as perfect number
public class StrongNumberTest {
	public static  boolean checkStrong(int num) {
		//local variable deccloaration
		int temp=num;
		int sum=0;
		int rem=0;
		while(temp>0) {
		int fact=1;
		rem=temp%10;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		temp=temp/10;
		
		}
		if(num==sum) {
				
		return true;
		}
		
		return false;
	}
	
	public static void printStrong(int startRange,int endRange) {
		for(int i=startRange;i<=endRange;i++) {
			if(checkStrong(i)) {
				System.out.println(i+" is a strong number");
			}
		}
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");//145
		checkStrong(sc.nextInt());
		printStrong(1,100000);

	}

}
