package Number_System;

import java.util.Scanner;

public class MainFactoriaal {
	static int mainFact(int n) {
		int fact=1;
		while(n>1) {
			fact=fact*n;
			n--;			
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int x=sc.nextInt();
		
		
		System.out.println("factorial of "+x+" is:"+mainFact(x));//direct passed value in method
	}
	

}
