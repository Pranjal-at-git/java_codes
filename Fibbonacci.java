package p2;

import java.util.Scanner;

public class Fibbonacci 
{
	public void method1(int n)
	{
		System.out.println("This is first way");
		int num1=0,num2=1;
		System.out.print(num1+" "+num2+" ");
		for(int i=1;i<=n;i++)
		{
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(num3+" ");
		}
		
	}
	public void method2(int n)
	{
		System.out.println("This is second way");
		int num1=0,num2=1;
		System.out.print(num1+" "+num2+" ");
		int i=1;
		while(i<=n)
		{
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(num3+" ");
			i++;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Fibbonacci fn=new Fibbonacci();
		System.out.println("Enter the length of fibbonacci series : ");
		int n=sc.nextInt();
		fn.method1(n);
		System.out.println();
		fn.method2(n);
		sc.close();
		
	}
}
