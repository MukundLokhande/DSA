package Day01.Arrays;

public class AllSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,8,10};
		int count = 0;
		for(int i = 0; i < arr.length; i++ )
		{
			for(int j = i; j < arr.length; j++ )
			{
				for(int k = i; k <= j; k++)
				{
					System.out.print(arr[k] + " ");
					count++;
				}
		
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Count of total subArrays is: "+ count);
	}

}
