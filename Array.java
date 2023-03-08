package p1;

public class Array {
	public static void main(String[] args) {
		int arr[]= {25,10,99,15,2,48};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array list is: ");
		for(int data:arr)
		System.out.print(data+" ");
	}

}
