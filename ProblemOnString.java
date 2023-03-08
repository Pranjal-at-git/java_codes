package p2;

import java.util.Scanner;

public class ProblemOnString
{
	public char charAtGivenIndex(String s, int index)
	{
	      char c=s.charAt(index);
	      return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		System.out.println("Enter index number :");
		int index=sc.nextInt();
		char c=new ProblemOnString().charAtGivenIndex(s,index);
		System.out.println("Charater at "+index+" index is : "+c);
	}
}
