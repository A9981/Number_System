package Number_System;

import java.util.Scanner;

public class DiseriumNum {	
		static int countDigits(int n) {
			int count=0;
			do {
				count++;
				n=n/10;
			}while(n!=0);
			return count;
		}
		static int pow(int n,int p) {
			int pw=1;
			
			while(p>0)
			{
				pw=pw*n;
				p--;
			}
			return pw;	
		}
		static boolean isDiserium(int x)
		{
			int dc=countDigits(x);
			int sum=0;
			int temp=x;
			do{
				int r=x%10;
				sum=sum+pow(r,dc);
				dc--;
				x=x/10;
			}while(x!=0);
			return temp==sum;
		}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any num");
		int n=sc.nextInt();
		boolean res=isDiserium(n);
		
		if(res==true)
			System.out.println(n+" is a Diserium number: "+res);
		else
			System.out.println(n+" is a Diserium number: "+res);
	}
	
}
