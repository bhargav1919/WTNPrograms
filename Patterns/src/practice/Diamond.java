package practice;
import java.util.Scanner;
public class Diamond 
{
	public static void main(String args[])
	{
	int n,i,j,k,s;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	s=n-1;
	for(i=0;i<n;i++)
	{
		for(k=1;k<=s;k++)
		{
			System.out.print(" ");
		}
		s=s-1;
		for(j=0;j<=i;j++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
	s=1;
	for(i=0;i<n;i++)
	{
		for(k=1;k<=s;k++)
		{
			System.out.print(" ");
		}
		s=s+1;
		for(j=n;j>i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	}
}
