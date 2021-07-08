public class Circle {
	private double radi;
	
	public Circle(double radi)
	{
		this.radi = (radi <= 0 ? 1 : radi); 
	}
	public double setRadius(double radi)
	{
		return this.radi = (radi <= 0 ? 1 : radi); 
	}
	
	public double areaFunction()
	{
		return  Math.PI * this.radi * this.radi;
	}
	
	public double dia()
	{
		return this.radi*2;
	}
	
	public double cir()
	{
		return dia()*Math.PI;
	}
	public double getRadi()
	{
		return this.radi;
	}
	
	public String toString()
	{
		return "lol";
	}
}
