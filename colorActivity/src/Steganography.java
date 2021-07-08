import java.awt.*;
import java.util.*;

public class Steganography {
	public static void main(String args[])
	{
		/*Picture source1 = new Picture ("bin/beach.jpg");
		source1.explore();
		Picture secret1 = new Picture ("bin/arch.jpg");
		secret1.explore();
		
		Picture beach = new Picture ("bin/beach.jpg");
		beach.explore();
		Picture copy = testClearLow(beach);
		copy.explore();
		
		Picture beach2 = new Picture ("bin/beach.jpg");
		beach2.explore();
		Picture copy2 = testSetLow(beach2, Color.PINK);
		copy2.explore(); 	
		
		Picture copy3 = revealPicture(copy2);
		copy3.explore();
		
		//2.8
		Picture beach3 = new Picture("bin/beach.jpg");
		Picture arch = new Picture("bin/arch.jpg");
		System.out.print("beach sma size as arch: "+canHide(beach, arch));
		
		//2.9
		Picture swan = new Picture("bin/swan.jpg");
		Picture gorge = new Picture("bin/gorge.jpg");
		Picture combined = hidePicture(swan, gorge);
		combined.explore();
		
		//2.11
		if(canHide(swan,gorge))
		{
			Picture combined1 = hidePicture(swan, gorge);
			combined1.explore();
			Picture revealed = revealPicture(combined1);
			revealed.explore();
		}
		
		
		//3.1
		Picture beach = new Picture("bin/beach.jpg");
		Picture robot = new Picture("bin/robot.jpg");
		Picture flower1 = new Picture("bin/flower1.jpg");
		beach.explore();
		Picture hidden1 = hidePicture(beach, robot, 65, 208);
		Picture hidden2 = hidePicture(hidden1, flower1, 280, 110);
		hidden2.explore();
		Picture unhidden = revealPicture(hidden2);
		unhidden.explore();
		
		
		// 3.2
		Picture swan = new Picture("bin/swan.jpg");
		Picture swan2 = new Picture("bin/swan.jpg");
		System.out.println("Swan and swan2 are the same: " +
		isSame(swan, swan2));
		swan = testClearLow(swan);
		System.out.println("Swan and swan2 are the same (after clearLow run on swan): "
		+ isSame(swan, swan2));
		*/
		// 3.3
		Picture arch = new Picture("bin/arch.jpg");
		Picture koala = new Picture("bin/koala.jpg") ;
		Picture robot1 = new Picture("bin/robot.jpg");
		Picture arch2 = hidePicture(arch, robot1, 65, 102);
		ArrayList<Point> pointList = findDifferences(arch, arch2); 
		System.out.println("PointList after comparing two identical s pictures " +
		"has a size of " + pointList.size());
		pointList = findDifferences(arch, koala);
		System.out.println("PointList after comparing two different sized pictur t es " +
		"has a size of " + pointList.size());
		pointList = findDifferences(arch, arch2);
		System.out.println("Pointlist after hiding a picture has a siz m e of"
		+ pointList.size());
		arch.show();
		arch2.show();
		
		
		//3.4
		Picture hall = new Picture("bin/femaleLionAndHall.jpg");
		Picture robot2 = new Picture("bin/robot.jpg");
		Picture flower2 = new Picture("bin/flower1.jpg");
		// hide pictures
		Picture hall2 = hidePicture(hall, robot2, 50, 300);
		Picture hall3 = hidePicture(hall2, flower2, 115, 275);
		hall3.explore();
		if(!isSame(hall, hall3))
		{
		Picture hall4 = showDifferentArea(hall,findDifferences(hall, hall3));
		hall4.show();
		Picture unhiddenHall3 = revealPicture(hall3);
		unhiddenHall3.show();
		}
		
		
		Picture beach = new Picture("bin/beach.jpg");
		beach.explore();
		Picture hiddenText = hideText(beach, "THIS IS A TEST");
		hiddenText.explore();
		String reveal = revealText(hiddenText);
		if(reveal.equals("THIS IS A TEST"))
		{
			System.out.print("It worked");
		}
		else
		{
			System.out.println("Something went wrong");
		}
		
		
		
		
				
	}
	public static String revealText(Picture source)
	{
		Pixel leftPixel = null; 
		Pixel[][] pixels = source.getPixels2D();
		Color leftColor = null;
		String result = "";
		ArrayList<Integer> codes = new ArrayList<Integer>();
		boolean finished = false;
		for(int row = 0; row < pixels.length && !finished; row++)
		{
			for(int col = 0; col < pixels[0].length && !finished; col++)
			{
				leftPixel = pixels[row][col];
				leftColor = leftPixel.getColor();
				int code = leftColor.getRed() % 4 + (leftColor.getGreen() % 4) * 4 + (leftColor.getBlue() % 4) * 16;
				if(code==0)
				{
					finished = true;
				}
				else
				{
					codes.add(code);
				}
			}
		}
		return decodeString(codes);
	}
	private static int[] getBitPairs(int num)
	{
		 int[] bits = new int[3];
		 int code = num;
		 for (int i = 0; i < 3; i++)
		 {
		 bits[i] = code % 4;
		 code = code / 4;
		 }
		return bits;
		}
		public static String decodeString(ArrayList<Integer> codes)
		{
		String result="";
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i=0; i < codes.size(); i++)
		{
		 if (codes.get(i) == 27)
		{
		 result = result + " ";
		 }
		 else
		{
		 result = result +
		alpha.substring(codes.get(i)-1,codes.get(i));
		}
		 }
		 return result;
	} 
	public static ArrayList<Integer> encodeString(String s)
	{
	s = s.toUpperCase();
	String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 ArrayList<Integer> result = new ArrayList<Integer>();
	 for (int i = 0; i < s.length(); i++)
	{
	 if (s.substring(i,i+1).equals(" "))
	{
	 result.add(27);
	 }
	else
	{
	 result.add(alpha.indexOf(s.substring(i,i+1))+1);
	 }
	 }
	 result.add(0);
	 return result;
	} 
	
	public static Picture hideText(Picture source, String s)
	{
		Pixel leftPixel = null;
		Picture newPic = new Picture(source);
		Pixel[][] pixels = newPic.getPixels2D();
		Color leftColor = null;
		
		ArrayList<Integer> eCode = encodeString(s);
		
		int currentCharNum = 0;
		for(int row = 0; row < pixels.length && currentCharNum < eCode.size(); row++)
		{
			for(int col = 0; col < pixels[0].length && currentCharNum < eCode.size(); col++)
			{
				leftPixel = pixels[row][col];
				clearLow(leftPixel);
				leftColor = leftPixel.getColor();
				int[] bits = getBitPairs(eCode.get(currentCharNum));
				leftPixel.setColor(new Color(leftColor.getRed()+bits[0], leftColor.getGreen()+bits[1], leftColor.getBlue()+bits[2]));
				currentCharNum++;
			}
		}
		
		return newPic;
		
	}
	
	  public static Picture showDifferentArea (Picture pic, ArrayList<Point> points)
	  {
	    Picture result = new Picture(pic);
	    
	    //set starting points so that first Point examined changes it    
	    int minRow = pic.getHeight()-1, minCol = pic.getWidth() - 1;
	    int maxRow = 0, maxCol = 0;
	    
	    // find the upper left and lower right point in the arraylist myPoints
	    for(Point p: points)
	    {
	      int row = (int)p.getX();
	      int col = (int)p.getY();
	      if(row < minRow)
	      {
	        minRow = row;
	      }
	      if(row > maxRow)
	      {
	        maxRow = row;
	      }
	      if(col < minCol) 
	      {
	        minCol = col;
	      }
	      if(col > maxCol)
	      {
	        maxCol = col;
	      }
	    }
	    Pixel pixel = null;
	    //color top and bottom of bounding rectangle
	    for(int col = minCol; col <= maxCol; col++)
	    {   
	      pixel = result.getPixel(col, minRow);
	      pixel.setColor(Color.red);
	      pixel = result.getPixel(col, maxRow);
	      pixel.setColor(Color.red);
	    }
	    //color sides of bounding rectangle
	    for(int row = minRow + 1; row < maxRow; row++)
	    {
	      pixel = result.getPixel(minCol,row);
	      pixel.setColor(Color.red);
	      pixel = result.getPixel(maxCol, row);
	      pixel.setColor(Color.red);
	    }
	    return result;
	  }
	public static ArrayList<Point> findDifferences(Picture pic1, Picture pic2)
	{
	    ArrayList<Point> list = new ArrayList<Point>();
	    
	    Pixel[][] pixels = pic1.getPixels2D();
	    Pixel[][] otherPixels = pic2.getPixels2D();
	    Pixel pixel = null;
	    Pixel otherPixel = null;
	    if(pic1.getWidth() != pic2.getWidth() || 
	       pic1.getHeight() != pic2.getHeight())
	    {
	      return list;
	    }
	    
	    for (int row = 0; row < pixels.length;row++)
	    {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	        pixel = pixels[row][col];
	        otherPixel = otherPixels[row][col];
	        
	        if(pixel.getRed() != otherPixel.getRed()
	             || pixel.getGreen() != otherPixel.getGreen()
	             || pixel.getBlue() != otherPixel.getBlue())
	        {
	          list.add(new Point(row, col));
	        }
	      }
	    }
	    return list;
	  }
	public static boolean isSame(Picture pic1, Picture pic2)
	{
		Pixel[][] pix1 = pic1.getPixels2D();
		Pixel[][] pix2 = pic2.getPixels2D();
		
		if(pix1.length != pix2.length)
		return false;
		
		for(int r = 0; r < pix1.length; r++)
		{
			for(int c = 0; c < pix1.length; c++)
			{
				if(pix1[r][c].getBlue() !=  pix2[r][c].getBlue() || pix1[r][c].getGreen() !=  pix2[r][c].getGreen() || pix1[r][c].getRed() !=  pix2[r][c].getRed())
					return false;
			}
		}
		return true;
	}
	public static Picture hidePicture(Picture source, Picture secret)
	{
		Picture hidden = new Picture(source);
		Pixel[][] hPix = hidden.getPixels2D(); 
		Pixel[][] sPix = secret.getPixels2D();
		
		for(int r = 0; r < hPix.length; r++)
		{
			for(int c = 0; c < hPix[r].length; c++)
			{
				Pixel s = sPix[r][c];
				setLow(hPix[r][c], s.getColor());
			}
		}
		return hidden;
	}
	public static Picture hidePicture(Picture source, Picture secret, int startRow, int startColumn)
	{
		Picture hidden = new Picture(source);
		Pixel[][] hPix = hidden.getPixels2D(); 
		Pixel[][] sPix = secret.getPixels2D();
		
		for(int r = startRow, r_s = 0; r < hPix.length && r_s < sPix.length; r++, r_s++)
		{
			for(int c = startColumn, c_s = 0; c < hPix[r].length && c_s < sPix[r_s].length; c++, c_s++)
			{
				Pixel s = sPix[r_s][c_s];
				setLow(hPix[r][c], s.getColor());
			}
		}
		return hidden;
	}
	public static boolean canHide(Picture source, Picture secret)
	{			
		return source.getWidth() >= secret.getWidth() && source.getHeight() >= secret.getHeight();
	}
	public static Picture testSetLow(Picture pic, Color col)
	{
		Picture p = new Picture(pic);
		Pixel [][] pixels = p.getPixels2D();
		for(int r = 0; r < pixels.length; r++)
		{
			for(int c = 0; c < pixels[0].length; c++)
			{
				setLow(pixels[r][c], col);
			}
		}
		return p;
	}
	public static void clearLow( Pixel p )
	{
		Color oldColor = p.getColor();
		
		p.setColor(new Color(4*(oldColor.getRed()/4), 4*(oldColor.getGreen()/4), 4*(oldColor.getBlue()/4)));
	}
	public static Picture testClearLow(Picture pic)
	{
		Picture p = new Picture(pic);
		Pixel [][] pixels = p.getPixels2D();
		for(int r = 0; r < pixels.length; r++)
		{
			for(int c = 0; c < pixels[0].length; c++)
			{
				clearLow(pixels[r][c]);
			}
		}
		return p;
	}
	
	/**
	* Set the lower 2 bits in a pixel to the highest 2 bits in c
	*/
	public static void setLow (Pixel p, Color c)
	{
		clearLow(p);
		p.setColor(new Color((p.getRed()+c.getRed()/64), (p.getGreen()+c.getGreen()/64), (p.getBlue()+c.getBlue()/64)));
	}
	
	public static Picture revealPicture(Picture hidden)
	{
		Picture copy = new Picture(hidden);
		Pixel[][] pixels = copy.getPixels2D();
		Pixel[][] source = hidden.getPixels2D();
		for (int r = 0; r < pixels.length; r++) 
		{
			for (int c = 0; c < pixels[0].length; c++)
			{
				Color col = source[r][c].getColor();
				Pixel p = pixels[r][c];
				p.setRed(col.getRed()%4 * 64);
				p.setGreen(col.getGreen()%4 * 64);
				p.setBlue(col.getBlue()%4 * 64);
			}
		}
		return copy; 
	}
}
