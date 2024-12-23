// 02
package Day01.Arrays;

public class FindLargestNumber {

	public static void main(String[] args)
	{
		int arr[] = {1,4,7,34,10,11,23,546,74,6,2};
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
