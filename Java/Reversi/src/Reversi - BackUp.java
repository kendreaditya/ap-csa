
// Aditya Kendre
// Reversi Class
// May 29th, 2019
// Reversi game (othello)

import java.util.Scanner;

public class Reversi {

	public static String board[][] = new String[8][8];
	public static Scanner xyPos = new Scanner(System.in);

	public static void main(String[] args)
	{
		int xy, x, y;
		boolean move;
		
		/*
		 * 		for(int r = 0; r < 8; r++)
			for(int c = 0; c < 8; c++)
				board[r][c].equals("o");
		 */

		clearBoard();
		printBoard();

		for(int i = 0; i <= 60; i++)
		{
			int even = 0;
			
			move = ((i % 2 == even) ? false : true);
			
			System.out.println("White has "+points(true)+" points!");
			System.out.println("Black has "+points(false)+" points!\n");
			
			/*
			if(possibleMove(move) == false)
			{
				System.out.println("No move possible for "+((move == true) ? "White (o)" : "Black (�)"));
				even = 1;
				move = ((i % 2 == even) ? false : true);
			}
			*/
			
			System.out.println(((move == true) ? "White (o)" : "Black (�)")+" Move\nPosition: ");
			xy = xyPos.nextInt();
			y = xy % 10;
			x = xy / 10;

			setBoard(x, y, move);
			printBoard();

		}

	}
	
	public static int points(boolean white)
	{
		int points = 0;
		String player = ((white == true) ? "o" : "�");
		
		for(int r = 0; r < 8; r++)
			for(int c = 0; c < 8; c++)
				if(board[r][c].equals(player))
					points++;
		
		return points;
	}
	
	public  static boolean possibleMove(boolean white)
	{
		String player = ((white == true) ? "o" : "�"), player2 = ((white == false) ? "o" : "�");
		
		for(int r = 0; r < 8; r++)
			for(int c = 0; c < 8; c++)
				if(board[r][c] == "null" && possibleMoveMain(r, c, white) == true)
					return true;
		
		return false;			
	}
	
	public  static boolean possibleMoveMain(int x,int y, boolean white)
	{
		String player = ((white == true) ? "o" : "�"), player2 = ((white == false) ? "o" : "�");
		boolean move = false;

		if(!board[x][y].equals("null"))
			return false;
		
		int r = 1;
		while(x-r > 0 && y-r > 0 && board[x-r][y-r].equals(player2))
			r++;
		if(x-r > 0 && y-r > 0 && board[x-1][y-1].equals(player2) && board[x-r][y-r].equals(player))
			move = true;
		
		r = 1;
		while(x+r < 7 && y+r < 7 && board[x+r][y+r].equals(player2))
			r++;
		if(x+r < 7 && y+r < 7 && board[x+1][y+1].equals(player2) && board[x+r][y+r].equals(player))
			move = true;
	
		r = 1;
		while(x+r > 0 && y-r > 0 && board[x+r][y-r].equals(player2))
			r++;
		if(x+r > 0 && y-r > 0 && board[x+1][y-1].equals(player2) && board[x+r][y-r].equals(player))
			move = true;
		
		r = 1;
		while(x-r < 7 && y+r < 7 && board[x-r][y+r].equals(player2))
			r++;
		if(x-r < 7 && y+r < 7 && board[x-1][y+1].equals(player2) && board[x-r][y+r].equals(player))
			move = true;
		
		r = 1;
		while(x-r > 0 && board[x-r][y].equals(player2))
			r++;
		if(x-r > 0 && board[x-1][y].equals(player2) && board[x-r][y].equals(player))
			move = true;

		r = 1;
		while(x+r < 7 && board[x+r][y].equals(player2))
			r++;
		if(x+r < 7 && board[x+1][y].equals(player2) && board[x+r][y].equals(player))
			move = true;

		r = 1;
		while(y-r > 0 && board[x][y-r].equals(player2))
			r++;
		if(y-r > 0 && board[x][y-1].equals(player2) && board[x][y-r].equals(player))
			move = true;

		r = 1;
		while(y+r < 7 && board[x][y+r].equals(player2))
			r++;
		if(y+r < 7 && board[x][y+1].equals(player2) && board[x][y+r].equals(player))
			move = true;


		return move;			
	}

	// True means white
	// false means black
	public static boolean validMove(int x,int y, boolean white)
	{
		String player = ((white == true) ? "o" : "�"), player2 = ((white == false) ? "o" : "�");
		boolean move = false;

		if(!board[x][y].equals("null"))
			return false;
		
		int r = 1;
		while(x-r > 0 && y-r > 0 && board[x-r][y-r].equals(player2))
			r++;
		if(x-r > 0 && y-r > 0 && board[x-1][y-1].equals(player2) && board[x-r][y-r].equals(player))
		{
			move = true;
			for(int xr = 1; xr <= r; xr++)
			{
				board[x-xr][y-xr] = player;
			}
		}
		
		r = 1;
		while(x+r < 7 && y+r < 7 && board[x+r][y+r].equals(player2))
			r++;
		if(x+r < 7 && y+r < 7 && board[x+1][y+1].equals(player2) && board[x+r][y+r].equals(player))
		{
			move = true;
			for(int xr = 1; xr <= r; xr++)
			{
				board[x+xr][y+xr] = player;
			}
		}
		
		r = 1;
		while(x+r > 0 && y-r > 0 && board[x+r][y-r].equals(player2))
			r++;
		if(x+r > 0 && y-r > 0 && board[x+1][y-1].equals(player2) && board[x+r][y-r].equals(player))
		{
			move = true;
			for(int xr = 1; xr <= r; xr++)
			{
				board[x+xr][y-xr] = player;
			}
		}
		
		r = 1;
		while(x-r < 7 && y+r < 7 && board[x-r][y+r].equals(player2))
			r++;
		if(x-r < 7 && y+r < 7 && board[x-1][y+1].equals(player2) && board[x-r][y+r].equals(player))
		{
			move = true;
			for(int xr = 1; xr <= r; xr++)
			{
				board[x-xr][y+xr] = player;
			}
		}
		
		r = 1;
		while(x-r > 0 && board[x-r][y].equals(player2))
			r++;
		if(x-r > 0 && board[x-1][y].equals(player2) && board[x-r][y].equals(player))
		{
			move = true;
			for(int xr = 1; xr <= r; xr++)
			{
				board[x-xr][y] = player;
			}
		}

		r = 1;
		while(x+r < 7 && board[x+r][y].equals(player2))
			r++;
		if(x+r < 7 && board[x+1][y].equals(player2) && board[x+r][y].equals(player))
		{
			move = true;
			for(int xr = 1; xr <= r; xr++)
			{
				board[x+xr][y] = player;
			}
		}

		r = 1;
		while(y-r > 0 && board[x][y-r].equals(player2))
			r++;
		if(y-r > 0 && board[x][y-1].equals(player2) && board[x][y-r].equals(player))
		{
			move = true;
			for(int xr = 1; xr <= r; xr++)
			{
				board[x][y-xr] = player;
			}
		}

		r = 1;
		while(y+r < 7 && board[x][y+r].equals(player2))
			r++;
		if(y+r < 7 && board[x][y+1].equals(player2) && board[x][y+r].equals(player))
		{
			move = true;
			for(int xr = 1; xr <= r; xr++)
			{
				board[x][y+xr] = player;
			}
		}

		return move;
	}

	public static String[][] setBoard(int x, int y, boolean white)
	{
		if(white == true && validMove(x,y,white) == true)
			board[x][y] = "o";
		else if(white == false && validMove(x,y,white) == true)
			board[x][y] = "�";
		else
		{
			System.out.println("Your move is invaid, make your move again!\nPosition:");
			int xyNew = xyPos.nextInt(), yNew, xNew;
			yNew = xyNew % 10;
			xNew = xyNew / 10;
			setBoard(xNew, yNew, white);
		}
		return board;
	}

	public static void clearBoard()
	{
		for(int r = 0; r < 8; r++)
			for(int c = 0; c < 8; c++)
				board[r][c] = "null";
		board[4][3] = "o";
		board[3][4] = "o";
		board[3][3] = "�";
		board[4][4] = "�";
	}

	public static void printBoard()
	{
		String plusRow = "+-----+-----+-----+-----+-----+-----+-----+-----+";
		String emptyRow = "|     |     |     |     |     |     |     |     |";

		System.out.println("    0     1     2     3     4     5     6     7");
		for(int x = 0; x < 8; x++)
		{
			System.out.println(" "+plusRow);
			System.out.println(" "+emptyRow);
			System.out.print(x+"|");

			for(int i = 0; i < 8; i++)
			{
				if(board[x][i].equals("�"))
					System.out.print("  �  |");
				else if(board[x][i].equals("o"))
					System.out.print("  o  |");
				else
					System.out.print("     |");
			}

			System.out.println();
			System.out.println(" "+emptyRow);
		}

		System.out.println(" "+plusRow);
	}
}