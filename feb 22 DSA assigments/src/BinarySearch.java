
public class BinarySearch {
	 static int bs(int arr[], int target) {

	        int low = 0, high = arr.length - 1;

	        while (low <= high) {
	            
	            int mid = low + (high - low) / 2;
	            if (arr[mid] == target)
	                return mid;
	            else if (arr[mid] < target) {
	                low = mid + 1;
	            } else
	                high = mid - 1;
	        }
	        
	        System.out.println("Target not found");
	        return 0; 

}
public static void main(String args[])
{
	int arr[]= {'a','b','c','d','e','f','g','h','i','x','z'};
	int target= 'z';
	 System.out.println(bs(arr, target));
}
}