package string;

public class ReverseString 
{
	/*unsolved questions*/
	public void reverseString(String s)
	{
		String temp[]=s.split("");
		
		for(int i=temp.length-1;i>=0;i--)
		{
			System.out.print(temp[i]);
		}
		System.out.println(temp);
	}
	public static void main(String[] args) {
		ReverseString ob=new ReverseString();
		String str="ram is not syam"; 
		ob.reverseString(str);
	}

}
