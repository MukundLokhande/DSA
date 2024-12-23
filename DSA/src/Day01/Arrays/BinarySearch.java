//04
package Day01.Arrays;

import java.util.Arrays;

public class BinarySearch {

	public static int Search(int arr[], int key)
	{
		int first = 0, last = arr.length-1;
		int mid = (first + last) / 2;
		
		while (first <= last)
		{
			if(key == arr[mid])
			{
				//System.out.println( "\n index: ");
				return mid;
			}
			else if (key > arr[mid])
			{
				first = mid + 1;
				mid = (first + last) / 2;
			}
			else if (key < arr[mid])
			{
				last = mid - 1;
				mid = (first + last) / 2;
			}
		}
		return -1; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,7,34,10,0,11,23,546,74,6,2};
		int key = 23;
		Arrays.sort(arr);
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
		
		System.out.println("\nIndex for Key is: " + Search(arr, key));
	} 

}
