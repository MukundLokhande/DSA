//03

package Day01.Arrays;

public class FindSmallestNumber {

	public static void main(String[] args)
	{
		int arr[] = {1,4,7,34,10,0,11,23,546,74,6,2};
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}