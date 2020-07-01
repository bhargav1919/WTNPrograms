package javabasicprograms;
import java.util.Scanner;
public class fibonacci
{
	public static void main(String[] args) {
		int a=0,b=1,n,d;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++)
		{
			d=a+b;
			System.out.print(" "+d);
			a=b;
			b=d;
		}
				
	}
	
}