package p2;

import java.util.Scanner;

public class NumberBetweenHundred 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		if(num>=1 && num<=100)
		{
			System.out.println("the number "+num+" is, in between 1 to 100");
		}else
		{
			System.out.println("the number "+num+" is out of range");
		}
		sc.close();
	}
}
