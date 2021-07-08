public class algorithms {
	public static void main(String args[])
	{
		int nums[] = new int[10];
		
		// Search - looking through array for the location of an element aka KEY
		// Sort - putting the elements in order
		// Sequential Search / Linear Search - serachinbg throught array from the begaing to the end (left to right)
			// ADV - the list does not need to sorted for this to work
			// DIS - only find the first of duplicate values
		
		// Best Case - 1 step
		// Worst Case - n step
		// Average Case - n/2
		
		fillArray(nums);
		printArray(nums);
		
		System.out.println(java.time.LocalTime.now());  
		// Where is the number 4 in the array
		int keyIndex = linearSearch(nums, 4);
		if(keyIndex == -1)
			System.out.println("ELEMENT NOT FRICKEN FOUND");
		else
			System.out.println("ELEMENT FOUND AT "+keyIndex);
		
		// Binary Search - "guess the number, higer/lower" game, the list must be SORTED! this is harder to code but is much faster
		
		// Selection Sort - easy to code but very inefficient algorithm. It selects the smallest element into place. Then does the second smallest, ect...
		// ALWAYS GOES THOUGH ALL STEPS n^2
				
		
		selectionSort(nums);
		printArray(nums);
		System.out.println(java.time.LocalTime.now());  
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println(java.time.LocalTime.now());  
		// Where is the number 4 in the array
		keyIndex = binarySearch(nums, 4);
		
		if(keyIndex == -1)
			System.out.println("ELEMENT NOT FRICKEN FOUND");
		else
			System.out.println("ELEMENT FOUND AT "+keyIndex);
		
		// Binary Search - "guess the number, higer/lower" game, the list must be SORTED! this is harder to code but is much faster
		
		// Selection Sort - easy to code but very inefficient algorithm. It selects the smallest element into place. Then does the second smallest, ect...
		// ALWAYS GOES THOUGH ALL STEPS n^2
				
		
		selectionSort(nums);
		printArray(nums);
		System.out.println(java.time.LocalTime.now());  
		
	}
	public static void mergeSort(int arr[])
	{
		int n = arr.length;
		int temp[] = new int[n];
		mergeSortHelper(arr, 0, n-1, temp);
	}
	public static void mergeSortHelper(int arr[], int from, int to, int temp[])
	{
		if(from < to)
		{
			int middle = (from+to)/2;
			mergeSortHelper(arr, from, middle, temp);
			mergeSortHelper(arr, middle +1, to, temp);
			merge(arr, from, middle, to, temp);
		
		}
	}
	public static void merege(int arr[], int from, int middle, int to, int temp[])
	{
		int i = from;
		int j = middle +1;
		int k = from;
		
		while(i <= middle && j <= to)
		{
			if(arr[i] < arr[j])
			{
				temp[k] = arr[i];
				i++;
			}
			k++;
		}
		while(i <= middle)
		{
		temp[k] = arr[i];
		i++;
		k++;
		}
		while(j <= to)
		{
			temp[k] = arr[j];
			j++;
			k++;
		}
		
		for(k=from;k <= to; k++)
		{
			arr[k] = temp[k];
		}
	}
	public static int binarySearch(int arr[], int key)
	{
		int left = 0, right = arr.length - 1;
		
		while(left <= right)
		{
			int middle = (left+right)/2;
			if(key < arr[middle])
			{
				right = middle - 1;
			}
			else if(key> arr[middle])
			{
				left = middle + 1;
			}
			else
			{
				return middle;
			}
			
		}
		
		return -1;
	}
	
	public static void selectionSort(int arr[])
	{
		for(int x=0; x<arr.length-1;x++)
		{
			int smallest = x;
			
			for(int index = x+1; index<arr.length;index++)
			{
				if(arr[index] < arr[smallest])
				{
					smallest = index;
				}
			}
			
			int temp = arr[smallest];
			arr[smallest] = arr[x];
			arr[x] = temp;
		}
	}
	
	public static int linearSearch(int arr[], int key)
	{
		for(int x=0; x < arr.length; x++)
			if(arr[x] == key)
				return x;
		
		return -1;
	}
	
	public static void fillArray(int arr[])
	{
		for(int x=0; x < arr.length; x++)
		{
			arr[x] = (int)(Math.random()*10)+1;
		}
	}
	public static void printArray(int arr[])
	{
		System.out.print("[ ");
		for(int num:arr)
			System.out.print(num+" ");
		System.out.println("]");
	}
	
}
