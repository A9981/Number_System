package Number_System;

import java.util.Scanner;

public class HappyNum {
//sum of Square of indivisual digit  until number become  a digit, if
	//digit is 1 or 7 is called happy number.
	static boolean isHappy(int n) {
		int sum=0;
		while(n>9)
		{
			while(n!=0)
			{
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}
			n=sum;
		}
		return n==1||n==7;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int x=sc.nextInt();
		boolean p=isHappy(x);
		System.out.println(x+" is a happy number: "+p);
	}

}
