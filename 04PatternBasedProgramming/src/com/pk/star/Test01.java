package com.pk.star;

public class Test01 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				//printing space
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" * ");
				if(i==k)
					continue;
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
