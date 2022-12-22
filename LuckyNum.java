package Number_System;

import java.util.Scanner;

public class LuckyNum {
	static boolean isLucky(int n) {
		int sum=0;
		while(n>9) {
			do {
				int r=n%10;
				sum=sum+r;
				n=n/10;
			}while(n!=0);
			n=sum;
		}
		return n==9;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int x=sc.nextInt();
		boolean p=isLucky(x);
		System.out.println(x+" is a lucky num: "+p);
	}

}
