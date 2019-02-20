
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    private double mySide;	// length of side

    // initializes myName and mySide
    public Square (String name, double side)
    {
        super(name);
        mySide = side;
    }

    public void calcPerimeter()
    {
        myPerimeter = (mySide * 4);
    }

    public void calcArea()
    {
        myArea = (mySide * mySide);
    }
}