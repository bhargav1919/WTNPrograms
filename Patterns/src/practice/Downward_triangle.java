package practice;
import java.util.Scanner;
public class Downward_triangle 
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=n;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
