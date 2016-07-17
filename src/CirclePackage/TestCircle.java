package CirclePackage;

public class TestCircle {
	/** main method */
	public static void main(String[] args) {
	//Create  a circle with radius 5.0
	Circle myCircle = new Circle(5.0);  //instance of circle
	System.out.println("The area of the circle of radius "
		+ myCircle.getRadius() + " is " + myCircle.findArea());
		
	Cylinder cyl = new Cylinder();
	System.out.print("The length is " + cyl.getLength());
	
	}
}
