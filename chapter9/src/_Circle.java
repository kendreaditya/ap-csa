public class _Circle {
   private double radius;
   private Point point;   // composition

   // no-argument constructor
   public _Circle()
   {
      this( 0, 0, 0 );
   }
	
   // constructor
   public _Circle( double circleRadius, int xCoordinate,
      int yCoordinate )
   {
      // instantiate point object
      point = new Point( xCoordinate, yCoordinate );

      setRadius( circleRadius );
   }

   // set radius of Circle
   public void setRadius( double circleRadius )
   {
      radius = ( circleRadius >= 0 ? circleRadius : 0 );
   }

   // get radius of Circle
   public double getRadius()
   {
      return radius;
   }

   // calculate area of Circle
   public double area()
   {
      return Math.PI * radius * radius;
   }

   // convert the Circle to a String
   public String toString()
   {
      return "Center = " + point + "; Radius = " + radius;
   }

   // convert Point to String
   public String getPointString()
   {
      return point.toString();
   }

}  // end class Circle
