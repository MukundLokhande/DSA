// 01
package Day01.Arrays;

public class FindKeyInArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = {1,4,7,34,10,11};
		int key = 10;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(key == arr[i])
			{
				System.out.println(i);
				break;
			}
		}	
	}
}
