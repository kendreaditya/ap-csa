
public class _2DArraysMethods {
	public static void main(String args[])
	{
		int grid[][]= new int[3][5];
		
		fillArray(grid);
		printArray(grid);
		
		grid[0][0] = toMultiply(grid[0][0], 2);
		
		toMultiply(grid[1], 2);
		printArray(grid);
		
		int col[] = new int[grid.length];
		
		for(int i = 0; i < col.length; i++)
		{
			col[i] = grid[0][i];
		}
		
		//toMultiply(col,0);
		//printArray(col);
		

		// To pass a column from a 2d array into a method

	}

	public static int[][] copyArray(int num[][])
	{
		return new int[5][5];
	}
	
	public static int toMultiply(int num, int multiply)
	{
		return num*multiply;
	}
	public static void toMultiply(int[] num, int multiply)
	{
		for(int i = 0; i < num.length; i++)
			num[i] *= 2;
	}
	public static void fillArray(int arr[][])
	{
		for(int x=0; x < arr.length; x++)
		{
			for(int y=0; y < arr[x].length; y++)
				arr[x][y] = (int)(Math.random()*10)+1;
		}
	}
	public static void printArray(int arr[][])
	{
		for(int num[]:arr)
		{
			System.out.print("[ ");
			for(int element: num)
				System.out.print(element+" ");
			System.out.println("]");
		}
		System.out.println();
	}
}
