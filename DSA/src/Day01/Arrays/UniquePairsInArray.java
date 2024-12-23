package Day01.Arrays;

public class UniquePairsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6,7,8};
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				System.out.print("(" + arr[i] + "," + arr[j]+ ")  ");
			}
			System.out.println(); 
		}
	}

}
