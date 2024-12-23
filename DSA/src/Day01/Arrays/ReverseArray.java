//05 reverse without using an extra array
package Day01.Arrays;

public class ReverseArray {

	public static void main(String[] args)
	{
		int arr[] = {1,4,7,34,10,0,11,23,546,74,6,2,33};
		int iterator = arr.length / 2;
		
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
		
		int first = 0, last = arr.length -1;
		
		for (int i = 1; i <= iterator; i++)
		{
			int temp = 0;
			
			temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			
			first++; last--;
		}
		
		System.out.println();
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
	}
}
