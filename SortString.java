package string;

import java.util.Arrays;

public class SortString {
	public void sortAWord(String s)
	{
		/** we need to convert string into character array*/
		char charArray[] =s.toCharArray();
		/** using sort(char[]) which belongs to 'Arrays' class to sort the given string*/
		Arrays.sort(charArray);
		/* but it only sort either uppercase or lowercase letters not mixer of both*/
		System.out.println(charArray);
	}
	public void sortString(String s)
	{
		String s1=s.toLowerCase();
		System.out.println(s1);
		char charArray[]=s1.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
	}
	public void isAnagram(String s1,String s2)
	{
		char charArray1[]=s1.toLowerCase().toCharArray();
		char charArray2[]=s2.toLowerCase().toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if(Arrays.equals(charArray1,charArray2))
		{
			System.out.println(s1+" and "+s2+" both contains same letters ");
		}else
		{
			System.out.println(s1+" , "+s2+" both are not contains same letters");
		}
	}
	public void sortArrayOfNames(String arr[])
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("------------Print using forEach loop-------------");
		for(String data:arr)
		{
			System.out.println(data);
		}
	}
	public static void main(String[] args) {
		SortString sobj=new SortString();
		String s1="Keeps",s2="Peek";
		//sobj.sortAWord(s1);
		//sobj.sortString(s1);
		//sobj.isAnagram(s1, s2);
		String arr[]= {"Bahul","Damal","Cavjot","Anand"};
		sobj.sortArrayOfNames(arr);
	}

}
