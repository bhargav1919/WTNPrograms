package practice;
import java.util.Scanner;
public class right_trinagle 
{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			int i,j,n;
			n=sc.nextInt();
			for(i=0;i<n;i++)
			{
				for(j=0;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
}
}