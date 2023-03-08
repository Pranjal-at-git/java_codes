package p2;

public class sumOfNaturalNumbers
{
	public static void main(String[] args) 
	{
		int  num=10205020;
		long sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of "+num+" natural numbers are : "+sum);
	}
}
