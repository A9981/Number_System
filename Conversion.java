package Number_System;

import java.util.Scanner;

public class Conversion {
	static void decitoBinary(int n) {
		String str="";
		int t=n;
		do {
			int b=n%2;
			str=b+str;
			n=n/2;
		}while(n!=0);
	    System.out.println("binary of "+t+" is "+str);
	}
	static void decitoOctal(int n) {
		String str="";
		int t=n;
		do {
			int b=n%8;
			str=b+str;
			n=n/8;
		}while(n!=0);
	    System.out.println("octal num of "+t+" is "+str);
	}
	static void decitoHexadecimal(int n) {
		String hx="";
		int t=n;
		do {
			int b=n%16;
			if(b<10)
    			hx=b+hx;
			else
			hx=((char)(b+55)+hx);
			n=n/16;
		}while(n!=0);
	    System.out.println("Hexadecimal num of "+t+" is "+hx);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		decitoBinary(n);
		decitoOctal(n);
		decitoHexadecimal(n);
		

	}

}
