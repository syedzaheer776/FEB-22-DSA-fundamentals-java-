
public class findelement {
public static void main(String args[])
{
	int arr[]= {1,3,5,6};
	int target= 2;
	System.out.println(bs(arr,target));
}
static int bs(int arr[],int target)
{
	int low=0, high=arr.length-1;

	while(low<=high)
	{
		int mid= (low+(high-low)/2);
		if (arr[mid]==target)
		{
			return mid;
		}
		else if(arr[mid]>target) {
			high=mid-1;
		}
		else {
			low=mid+1;
		}
		System.out.println("target not found");
		//return low;
	}
	//return low;
	return high;
}
}
