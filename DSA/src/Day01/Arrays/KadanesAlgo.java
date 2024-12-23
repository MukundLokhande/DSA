package Day01.Arrays;

public class KadanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {12,5,7,-4,6,7,-3,-44,123};
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		
		for(int i = 0 ; i < arr.length; i++)
		{
			currentSum = currentSum + arr[i];
			if(currentSum < 0)
				currentSum = 0;
			maxSum = Math.max(currentSum, maxSum);
		}
		System.out.println("Max SubArray Sum: "+ maxSum);
	}

}
