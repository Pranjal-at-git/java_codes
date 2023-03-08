package p2;

public class ThirdLargestInArray {
	public int thirdLargestNo(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[2];
	}
	public static void main(String[] args) {
		ThirdLargestInArray obj=new ThirdLargestInArray();
		int a[]= {10,5,7,45,17,55};
		int large=obj.thirdLargestNo(a);
		System.out.println(large);
	}

}
