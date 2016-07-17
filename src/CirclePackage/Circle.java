package CirclePackage;

public class Circle {
	/** radius of a circle */
	private double radius;
	final private double pi = 3.14159;
	
	/** Construct a circle with radius 1 */
	public Circle()	{    // a constructor
		radius = 1.0;
	}
	
	/** Construct a circle with a specific radius */
	public Circle(double newRadius)	{   // a constructor
		radius = newRadius;
	}
	
	/** return(get) radius */
	public double getRadius()	{  //getter method
		return radius;
	}
	
	/** set new radius */
	public void setRadius(double newRadius)	{  //setter method
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	/** return the area of this circle */
	public double findArea()	{
		return radius * radius * pi;
	}
}
