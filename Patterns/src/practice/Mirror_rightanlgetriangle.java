package practice;
import java.util.Scanner;
public class Mirror_rightanlgetriangle 
{
	public static void main(String[] args) 
	{
		int i,k,j,s,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s=n-1;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=s;k++)
			{
				System.out.print(" ");
			}
			s=s-1;
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
