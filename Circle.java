
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
 	private double myRadius;	// length of radius
	
 	// initializes myName and myRadius
 	public Circle (String name, double radius)
 	{
 	    super(name);
 	    myRadius = radius;
 	}
	
 	public void calcPerimeter()
 	{
 	    myPerimeter = (2 * (Math.PI) * myRadius);
 	}
 	public void calcArea()
 	{
 	    myArea = ((Math.PI) * (myRadius * myRadius));
 	}
}