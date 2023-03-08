package p2;

import java.util.Scanner;

public class ArithmeticFloatOperation 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number :");
		float num1=sc.nextFloat();
		float num2=sc.nextFloat();
		float add=num1+num2;
		float sub=num1-num2;
		float mul=num1*num2;
		float div=num1/num2;
		
		System.out.println("Addition is : "+"\t"+add);
		System.out.println("Substraction is :"+"\t"+sub);
		System.out.println("Multiplication is :"+"\t"+mul);
		System.out.println("division is :"+"\t"+div);
		sc.close();
	}
}
