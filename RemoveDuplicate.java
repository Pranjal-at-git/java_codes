package p2;

import java.util.HashSet;

public class RemoveDuplicate {
	public void removeDuplicateElement(int a[])
	{
		/* Removing duplicate element from array by using HashSet*/
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		System.out.println(hs);
	}

	public static void main(String[] args) {
		RemoveDuplicate robj=new RemoveDuplicate();
		int arr[]= {1,3,5,3,1,4,9,9};
		robj.removeDuplicateElement(arr);

	}

}
