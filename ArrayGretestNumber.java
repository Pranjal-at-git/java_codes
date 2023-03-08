package p2;

public class ArrayGretestNumber 
{
	public int gretestNumber(int a[])
	{
		System.out.println("Array elements :- ");
		for(int data:a)
		System.out.print(data+"\t");
		System.out.println();
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max < a[i])
			{
				max=a[i];
			}
		}
		return  max;
	}
	public int smallestNumber(int a[])
	{
		System.out.println("Array elements :- ");
		for(int data:a)
		System.out.print(data+"\t");
		System.out.println();
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min > a[i])
			{
				min=a[i];
			}
		}
		return  min;
	}
	public static void main(String[] args)
	{
		int arr[]= {10,90,20,80,45,22};
		ArrayGretestNumber aobj=new ArrayGretestNumber();
		int max=aobj.gretestNumber(arr);
		System.out.println("Greatest Element is: "+max);
		System.out.println("---------------------------------------");
		int min=aobj.smallestNumber(arr);
		System.out.println("Smallest Element is: "+min);
		
	}
}
