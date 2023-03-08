package p2;

import java.util.Arrays;

public class CompareString {
	public void compareAlphabetOfTwoString(String s1,String s2)
	{
		char[] chars1=s1.toCharArray();
		char[] chars2=s2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		if(Arrays.equals(chars1, chars2))
		{
			System.out.println("String contains same alphabet");
		}
		else
		{
			System.out.println("String deosnot contain same alphabet");
		}
	}
	public static void main(String[] args) {
		CompareString obj=new CompareString();
		String s1="ABS";
		String s2="BSC";
		obj.compareAlphabetOfTwoString(s1,s2);

	}

}
