
public class binaryTest {
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.print(binray(arr, 11, 0, 10));
	}
	public static int binray(int x[], int key, int low, int high)
	{
		int middle;
		
		while(low <= high)
		{
			middle = (low+high)/2;
			System.out.println(middle);
			if(key == x[middle])
				return middle;
			else if(key < x[middle])
				high = middle -1;
			else if(key > x[middle])
				low = middle +1;
		}
		return -1;
	}
}
