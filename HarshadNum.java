package Number_System;

import java.util.Scanner;

public class HarshadNum {
	static boolean harshadIs(int n)
	{
		int temp=n,sum=0;
		do {
			sum=sum+n%10;
			n=n/10;
		}while(n!=0);
		return temp%sum==0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		boolean rs=harshadIs(n);
		if(rs)
			System.out.println(n+" is a harshad number");
		else
			System.out.println(n+" is not a harshad number");
			

	}

}
