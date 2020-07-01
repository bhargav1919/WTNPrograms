package practice;
import java.util.Scanner;
public class RightPascalTriangle 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int i,j,n;
	n=sc.nextInt();
	for(i=1;i<n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for(i=n;i>0;i--)
	{
		for(j=i;j>0;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}

}
}

