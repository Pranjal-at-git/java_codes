package p2;

import java.util.Scanner;

public class ProblemOnStr2 
{
	Scanner sc=new Scanner(System.in);
	public void concatStr()
	{
		/*Method to concatenating  to string*/
		System.out.println("Enter 1st String : ");
		String str1=sc.nextLine();
		System.out.println("Enter 2nd String : ");
		String str2=sc.nextLine();
		System.out.println(str1.concat(" "+str2));
	}
	public void searchStrInGivenStr()
	{
		System.out.println("Enter First String : ");
		String str1=sc.nextLine();
		System.out.println("Enter String to find in first");
		String str2=sc.nextLine();
		System.out.println(str1.contains(str2));
	}
	public void replaceOldWithNewStr()
	{
		String str1="HELLO WORLD MY NAME IS PRANJAL. AND I AM LEARNING JAVA AND JAVA IS AWESOME UNDERSTAND";
		System.out.println("enter replacing string");
		String str2=sc.nextLine();
		String newstr=str1.replace("JAVA", str2);
		System.out.println("Old String "+"\t"+str1+"\nNew String "+"\t"+newstr);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ProblemOnStr2 pstr=new ProblemOnStr2();
		//pstr.concatStr();
		//pstr.searchStrInGivenStr();
		pstr.replaceOldWithNewStr();
	}
}
