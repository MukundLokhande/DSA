package Day01.Arrays;

public class MaxSubArraySum 
{
	public static void main(String[] args) 
	{
			int arr[] = {1,-2,6,-1,3 };
			int max = Integer.MIN_VALUE;
			for(int i = 0; i < arr.length; i++ )
			{
				for(int j = i; j < arr.length; j++ )
				{	
					int sum = 0;
					
					for(int k = i; k <= j; k++)
					{
						sum = sum + arr[k];
					}
					
					if( sum > max)
						max = sum;
				}
			}
			
			System.out.println("Max Sum of subArrays is: "+ max);
		}

}
