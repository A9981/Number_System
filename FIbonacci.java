package Number_System;
import java.util.Scanner;

public class FIbonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range of fibonacci");
		int n=sc.nextInt();
		int f1=0,f2=1,sum=0;
		while(sum<n)
		{
			sum=sum+f1;
			f1=f2;
			f2=sum;	
			if(sum<n)
			System.out.print(sum+" ");
		}
	}

}
