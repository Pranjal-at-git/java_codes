package p2;

public class PrimeNumber {
	public static void checkPrime(int n)
	{
		boolean flag=false;
		// negative numbers, 0 and 1 are not  prime numbers 
		if(n<2)
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				// condition for non-prime number
				if(n%i==0)
				{
				  flag=true;
				}
			}
			if(!flag)
			{
				System.out.println(n+" is a prime number");
			}else
			{
				System.out.println(n+" is not a prime number");
			}
		}
	}
	
	static public void checkPrime2(int n)
	{
		int count=0;
		if(n<2)
		{
			System.out.println(n+" Is not a prime number");
		}
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println(n+" is not prime number");
		}else
		{
			System.out.println(n+" Is a prime number");
		}
	}
	public static void main(String[] args) {
		int num = 15;
		//checkPrime(num);
		checkPrime2(num);
}
}
