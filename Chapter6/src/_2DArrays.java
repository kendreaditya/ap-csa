

// A 2d array represents a table of values arranged in rows and columns
// The first indice in a 2d array represents the element's row
// The second represents the element's column

// Java does not suport 2d arrays directly, instead thinks of it as an array of arrays

// arr[0][0] arr[0][1]
// arr[1][0] arr[1][1]

// arr[r][c]

public class _2DArrays {
	public static void main(String args[])
	{
		int[][] a = new int[3][4];
		int b[][]= {{1,2},
					{4,4}};
		
		// java can also create "jagged" arrays
		int c[][] ={{1,2,3},
					{4,5}};
		
		//.length with 2d arrays
		System.out.print(a.length); // 3 - numeber rows
		System.out.print(a[0].length); // 4 -  number of elements aka colums
		
		System.out.print(c.length); // 2 rows
		System.out.print(c[0].length); // # of elemetns in row 0
		System.out.println(c[1].length); // # of elements in row 1
		
		print2DArray(b);
		print2DArray(c);
		
	}
	public static void print2DArray(int[][] arr)
	{
		for(int[] r:arr)
		{
			for(int c:r)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
