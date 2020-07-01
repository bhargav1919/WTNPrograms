package practice;
import java.util.Scanner;
public class rightdown_triangle 
{
	public static void main(String[] args) 
	{
		int i,j,n,s,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s=n;
		for(i=n;i>0;i--)
		{
			for(k=s;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
