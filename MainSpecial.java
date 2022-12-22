package Number_System;
import java.util.Scanner;

public class MainSpecial {

	public static void main(String[] args) {
		System.out.println("enter the integer value");
		  Scanner sc=new Scanner(System.in);

		  int x=sc.nextInt();

		  int d1=x/10;
		  int d2=x%10;

		 int sum=d1+d2+d1*d2;

		 if(sum==x)
		  System.out.println(x+" is a special no");

		  else 
		 System.out.println(x+" is not a special no");
		 

	}

}
