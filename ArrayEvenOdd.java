package p2;

public class ArrayEvenOdd {

	public static void main(String[] args) 
	{
	  int arr[]= {7,2,22,9,4,3,8,31,12};
	  int a[]=new int[arr.length];
	  int index=0;
	  //loop for finding even number
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i] % 2==0)
		  {
			  a[index]=arr[i];
			  index++;
		  }
	  }
	  
	  //loop for finding and arranging odd numbers
	  for(int j=0;j<arr.length;j++)
	  {
		  if(arr[j] % 2 !=0)
		  {
			  a[index]=arr[j];
			  index++;
		  }
	  }
	  // loop to print new arrow
	  for(int data:a)
	  {
		  System.out.print(data+", ");
	  }
	}

}
