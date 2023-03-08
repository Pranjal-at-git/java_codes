package pattern.program;

public class Pattern3 
{
	/*Number pattern*/
	public void patterType1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void patterType2()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	public void patterType3()
	{
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) 
	{
		Pattern3 pt=new Pattern3();
		pt.patterType1();
		System.out.println("-----------------------");
		pt.patterType2();
		System.out.println("-------------------------");
		pt.patterType3();
	}
}
