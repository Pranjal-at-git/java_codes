package p2;

public class CountDifferentCharacters 
{
	public static void main(String[] args)
	{
		String ch="java@is#AWESOME$12034PRAnjal565";
		int lower=0,upper=0,special=0,number=0;
		for(int i=0;i<ch.length();i++)
		{
			char c=ch.charAt(i);
			if(c>='A'&& c<='Z')
				upper++;
			else if(c>='a'&& c<='z')
				lower++;
			else if(c>='0'&& c<='9')
				number++;
			else
				special++;
		}
		System.out.println("lower case : "+lower);
		System.out.println("upper case : "+upper);
		System.out.println("number case : "+number);
		System.out.println("special case : "+special);
	}
}
