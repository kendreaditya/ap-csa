public class Trapezoid extends Quadrilateral{
	public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	public double calcArea()
	{
		return ((calcBases()[0]+calcBases()[1])/2.0)*calcHeight();
	}
	public String toString()
	{
		return String.format("Coordinates of Trapezoid are:\n(%f,%f),(%f,%f),(%f,%f),(%f,%f)\nHight is: %f\nArea is: %f\n", 
				getP1().getX(), getP1().getY(), 
				getP2().getX(), getP2().getY(), 
				getP3().getX(), getP3().getY(), 
				getP4().getX(), getP4().getY(),
				calcHeight(), calcArea());
	}

}
