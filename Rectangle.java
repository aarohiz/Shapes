
/**
 * Rectangle, which extends Shape. Calculates perimeter and area of a rectangle with different length and width
 *
 * @author (Aarohi Zade)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
 	private double myLength, myWidth;	// length, width
	
 	// initializes myName, myLength, myWidth
 	public Rectangle (String name, double length, double width)
	{
	    super(name);
	    myLength = length;
	    myWidth = width;
	}
 	public void calcPerimeter()
 	{
 	    myPerimeter = ((2*myWidth)+(2*myLength));
 	}
 	public void calcArea()
 	{
 	    myArea = (myWidth * myLength);
 	}
}