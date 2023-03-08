package p2;

public class PrimeNo1to1000 {
	public void printPrimeNumberBtw(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)//1%1=0
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
		
	}
	/** solved,  to print palindrome number between 1 to 1000*/
	public void palindromBetween(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			if(checkPalindrome(i))
			{
				System.out.print(i+" ,");
			}
		}
	}
	public static boolean checkPalindrome(int num)
	{
		int r=0,sum=0;
		int temp=num;
		boolean val=false;
		while(num>0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(sum==temp)
		{
			val=true;
		}
		return val;
	}
	public static void main(String[] args) {
		
		PrimeNo1to1000 obj=new PrimeNo1to1000();
		//obj.printPrimeNumberBtw(1, 50);
		obj.palindromBetween(101,300);
	}

}
