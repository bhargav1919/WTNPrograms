package javabasicprograms;
import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
	int n,a,c=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int temp=n;
	while(n>0)
	{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
	}
	if(c==temp)
	{
	System.out.println(temp+" is an armstrong number");
	}
	else
	{
		System.out.println(temp+" is not an armstrong number");
	}
}
}
