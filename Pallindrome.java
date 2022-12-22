package Number_System;

import java.util.Scanner;

public class Pallindrome {

	static boolean reverse(int n) {
//if a number and its reverse is same than number will be pallindrome number.
		int rev=0;
		int temp=n;
		do {
			int r=n%10;
	        rev=rev*10+r;
	        n=n/10;
		}while(n!=0);
		return rev==temp; 
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number:");
		int x=sc.nextInt();
		boolean p=reverse(x);
		System.out.println(x+" is a pallindrome number: "+p);

	}

}
