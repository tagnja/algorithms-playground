
/**
 * @Description
 * T(n) = O(logn)
 */
 public class BinarySearch
 {
	 static int binarySearch(int arr[], int left, int right, int N)
	 {
		 if (left <= right)
		 {
			 int mid = left + (right - left) / 2;
			 if (arr[mid] == N)
			 {
				 return mid;
			 }
			 if (arr[mid] > N)
			 {
				return binarySearch(arr, left, mid-1, N); // NOTICE. add return sentence.
			 }
			return binarySearch(arr, mid+1, right, N); 
		 }
		
		return -1;
		 
	 }
	 
	 public static void main(String[] args)
	 {
		 int arr[] = {1, 3, 4, 5, 7, 9}; // NOTICE. array is ordered.
		 System.out.println(binarySearch(arr, 0, arr.length-1, 9));
		 System.out.println(binarySearch(arr, 0, arr.length-1, 3));
	 }
 }