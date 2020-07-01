package javabasicprograms;
import java.util.Scanner;
public class palindrome {
public static void main(String[] args) {
	int n,temp,sum=0,r;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	temp=n;
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println(temp+" is an palindrome");
	}
	else
	{
		System.out.println(temp+" is not an palindrome");
	}
}
}
