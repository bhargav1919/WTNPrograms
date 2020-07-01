package javabasicprograms;
import java.util.Scanner;
public class Prime 
{
	public static void main(String[] args) {
		int i,j,n,c = 0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==0||n==1)
		{
			System.out.println(n+" is not a prime number");
		}
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				c=1;
				break;
			}
		}
		if(c==0)
		{
			System.out.println(n+" is a prime number");
		}
	}

}
