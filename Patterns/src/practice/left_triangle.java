package practice;
import java.util.Scanner;
public class left_triangle
{
public static void main(String args[]) 
{  
	Scanner sc=new Scanner(System.in);
	int i,j,n,k;
	n=sc.nextInt();
	
    for (i=0; i<n; i++) //outer loop for number of rows(n) 
    	{ 
    	    for(k=2*(n-i);k>=0;k--)
    	    {
    	    	System.out.print(" ");
    	    }
  
            for (j=0; j<=i; j++ ) //inner loop for number of columns
            { 
            System.out.print("* "); //print star
        
            } 
            System.out.println();
   
        //ending line after each row
    } 
} 
}
