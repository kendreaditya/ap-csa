
public class Board {

	private String board[][] = new String[8][8];

	public Board()
	{
		// don't know what to do
	}

	public Board(String board[][])
	{
		/*
		// Up Check
		if(board[x-1][y] == player2)
		{
			for(int r = 1; r < x; r++)
			{
				if(board[x-r][y] == player2)
					;
				//else if()
					//return false;
			}
		}

		// Down Check
		if(board[x+1][y] == player2)
		{
			for(int r = 1; r < 8-x; r++)
			{
				if(board[x+r][y] == player2)
					return true;
				else
					return false;
			}
		}

		// Up Check
		if(board[x][y-1] == player2)
		{
			for(int r = 1; r < x; r++)
			{
				if(board[x][y-r] == player2)
					return true;
				else
					return false;
			}
		}

		// Down Check
		if(board[x][y+1] == player2)
		{
			for(int r = 1; r < 8-x; r++)
			{
				if(board[x][y+r] == player2)
					return true;
				else
					return false;
			}
		}


		for(int r = 1; r < x; r++)
		{
			System.out.println(x-r+" "+ y + " " + player + player2);
			if(board[x-r][y] == player2 && board[x-r+1][y] == player)
				return true;
			//else if(board[x-r][y] == player)
				//return false;
			else if(board[x-r][y] == "null")
				break;
		}

		for(int r = 1; r < 8-x; r++)
		{
			if(board[x+r][y] == player2 && board[x+r-1][y] == player)
				return true;
			//else if(board[x+r][y] == player)
				//return false;
			else if(board[x+r][y] == "null")
				break;
		}
		 check backwards, if their is one below and above that is the other peice then check if false continute true - true, else check one more up and down, until get to the end of the array


		for(int r = 0; r < 8; r++)
			for(int c = 0; c < 8; c++)
			{
				if(board[r][c] == player)
				board[c][r]
			}
		*/
	}

	public void printBoard()
	{
		for(int x = 0; x <= 8; x++)
			System.out.print("\t"+x+"\t");
		for(int x = 0; x <= 8; x++)
			System.out.print("----+");

	}
}
