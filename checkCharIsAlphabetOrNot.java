package p2;

public class checkCharIsAlphabetOrNot 
{
	public static void main(String[] args) 
	{
		char ch='a';
		if(ch>='a'&&ch<='z'||ch>='A'&& ch<='Z')
			System.out.println(ch+" It is A Character(Alphabet)");
		else
			System.out.println(ch+" Is not a Alphabet");
	}
}
