import java.awt.Color;

public class Steganography {
	public static void main(String args[])
	{
		Picture source1 = new Picture ("bin/beach.jpg");
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
	public static boolean canHide(Picture source, Picture secret)
	{
		return source.getWidth() == secret.getWidth() && source.getHeight() == secret.getHeight();
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
