package practice;
import java.util.Scanner;
public class Pyramid
{
public static void main(String args[]) 
{  
	Scanner sc=new Scanner(System.in);
	int i,j,n,k,s;
	n=sc.nextInt();
	s=n-1;
    for (i=0; i<n; i++) //outer loop for number of rows(n) 
    	{ 
    	    for(k=1;k<=s;k++)
    	    {
    	    	System.out.print(" ");
    	    }
    	    s=s-1;
            for (j=0; j<=i; j++ ) //inner loop for number of columns
            { 
            System.out.print(" *"); //print star
        
            } 
            System.out.println();
   
        //ending line after each row
    } 
} 
}
