package Number_System;
import java.util.Scanner;

//sum of factorial of individuals digit is equal to that number is called Strong num.
public class StrongNum {
	static int strongIs(int n) {
		int sum=0;
		int t=n;
		do
		{
			int r=n%10;
			sum=sum+getFact(r);
			n=n/10;
		}while(n!=0);
		return sum;
	}
	static int getFact(int x) {
		int prod=1;
		while(x>0)
		{
			prod=prod*x;
			x--;
		}
		return prod;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num:");
		int p=sc.nextInt();
		int rs=strongIs(p);
		if(rs==p)
		System.out.println(p+" is a Strong number: ");
		else
		System.out.println(p+" is not a Strong number: ");
		

	}

}
