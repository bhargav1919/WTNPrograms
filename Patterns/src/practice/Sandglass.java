package practice;
import java.util.Scanner;
public class Sandglass {
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			int rows = sc.nextInt();            
			for (int i= 0; i<= rows-1 ; i++)
			{
			    for (int j=0; j <i; j++)
			    {
			        System.out.print(" ");
			    }
			    for (int k=i; k<=rows-1; k++) 
			    {
			    	System.out.print("*" + " "); 
			    }
			    System.out.println(""); 
			    } 
			for (int i= rows-1; i>= 0; i--)
			{
			    for (int j=0; j< i ;j++)
			    {
			        System.out.print(" ");
			    }
			    for (int k=i; k<=rows-1; k++)
			    {
			        System.out.print("*" + " ");
			    }
			    System.out.println("");
			}
		}
		}
}