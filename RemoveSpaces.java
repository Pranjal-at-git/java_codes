package string;

public class RemoveSpaces 
{
	public void removeAllWhiteSpaces(String s)
	{
		String str=s.replaceAll(" ","");
		System.out.println(str);
	}
	public void removeSpacesPutComma(String s)
	{
		String str=s.replaceAll(" ",", ");
		System.out.println(str);
	}
	public void checkStringIsPalindrom(String s)
	{
		String str=s.replaceAll(" ","");
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			temp=str.charAt(i)+temp;
		}
		if(str.equals(temp))
		{
			System.out.println(str+" Is Palindrome");
		}
		else
		{
			System.out.println(str+" Is Not a Palindrom");
		}
	}
	public static void main(String[] args) {
		RemoveSpaces obj=new RemoveSpaces();
		String str="My Name Is Pranjal",str2="na ma n";
		obj.removeAllWhiteSpaces(str2);
		System.out.println("------------------------");
		obj.removeSpacesPutComma(str2);
		obj.checkStringIsPalindrom(str2);
	}
}
