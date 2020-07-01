package practice;
import java.util.Scanner;
public class LeftTrainglePascal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,j,k,s,n;
		n=sc.nextInt();
		s=n-1;
		for(i=0;i<=n;i++)
		{
			for(k=s;k>=0;k--)
			{
				System.out.print(" ");
		
			}
			s=s-1;
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=n;i>0;i--)
		{
			for(k=i;k<=n;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
}
