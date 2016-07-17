package CirclePackage;
// Cylinder.java: Class definition for describing Cylinder
public class Cylinder extends Circle {
	private double length = 5.0;
	
	/** return length */
	public double getLength()	{  // getter method
		return length;
	}
	
	public void setLength(double length)	{
		this.length = length;
	}
	
	/** return the volume of this cylinder */
	public double findVolume()	{
		return findArea() * length;
	}
}
