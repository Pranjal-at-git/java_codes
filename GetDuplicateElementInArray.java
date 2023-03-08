package p2;

public class GetDuplicateElementInArray {
	public void duplicateElement(int arr[])
	{
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element "+arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetDuplicateElementInArray ob=new GetDuplicateElementInArray();
		int arr[]= {1,-3,5,9,-3,9,0};
		ob.duplicateElement(arr);
	}

}
