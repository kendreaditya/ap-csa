public class Quadrilateral {
	private Point p1, p2, p3, p4;
	
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		p3 = new Point(x3, y3);
		p4 = new Point(x4, y4);

	}
	public Point getP1()
	{
		return p1;
	}
	public Point getP2()
	{
		return p2;
	}
	public Point getP3()
	{
		return p3;
	}
	public Point getP4()
	{
		return p4;
	}
	public double perimeter()
	{
		double s1 = Math.pow(Math.pow((p1.getX()-p4.getX()), 2)+Math.pow((p1.getY()-p4.getY()), 2), 0.5);
		double s2 = Math.pow(Math.pow((p3.getX()-p4.getX()), 2)+Math.pow((p3.getY()-p4.getY()), 2), 0.5);
		double s3 = Math.pow(Math.pow((p3.getX()-p2.getX()), 2)+Math.pow((p3.getY()-p2.getY()), 2), 0.5);
		double s4 = Math.pow(Math.pow((p1.getX()-p2.getX()), 2)+Math.pow((p1.getY()-p2.getY()), 2), 0.5);
		
		return s1+s2+s3+s4;
	}
	public double calcHeight()
	{
		return Math.abs(getP1().getY()-getP4().getY());
	}
	public double[] calcBases()
	{
		double[] returnArr = {Math.abs(getP4().getX()-getP3().getX()), Math.abs(getP1().getX()-getP2().getX())};
		return returnArr;
	}
	public String toString()
	{
		return String.format("Coordinates of Quadrialteral are:\n(%f,%f),(%f,%f),(%f,%f),(%f,%f)\n", 
				p1.getX(), p1.getY(), 
				p2.getX(), p2.getY(), 
				p3.getX(), p3.getY(), 
				p4.getX(), p4.getY());
	}
	

}
