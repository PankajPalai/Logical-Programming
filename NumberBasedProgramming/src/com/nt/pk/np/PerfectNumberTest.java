package com.nt.pk.np;
/** This application meant for finding perfect number between a given range
 * 
 * A perfect number is a positive integer that is equal to the sum of its proper positive divisor excluding the number itself.
 * ex::6 is a perfect number,its divisiors are 1,2,3 (other than 6),sum of its divisors is equal to the number 6
 * 
 * procedure::1.input  :Number
 *            2.output :it is a/not a perfect number
 * 
 * 
 *
 */
//business logic:: 
 class Test{
	/*void checkPerfect(int num){
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0)
				sum=sum+i;

		}
	if(sum==num)
		System.out.println(num +" is a perfect number");
	else 
		System.out.println(num +" is not a perfect number");
	
	}
	*/
	 public void printPerfect(int startRange,int endRange) {
		 for (int i=1;i<=endRange;i++) {
			 int sum=0;
			 for(int j=1;j<i;j++) {
				 if(i%j==0) {
					 sum=sum+j;
				 }
			 }
				 if(sum==i) {
					 System.out.println(i);
				 }
			 
		 }
	 }
	 
}
class PerfectNumberTest{
	public static void main(String[] args) {
		Test obj=new Test();
		
		//obj.checkPerfect(128);
		obj.printPerfect(1,100000);
	}
}