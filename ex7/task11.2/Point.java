import java.util.Scanner;
// Stub
public class Point
{
  // defining the points
  private double x;
  private double y;

  // constructor method
  public Point (double reqX, double reqY)
  {
    x = reqX;
    y = reqY;
  }

  public Point shift (double xShift, double yShift)
  {
    return new Point (x + xShift, y + yShift);
  }

  public double getX ()
  {
  return x;
  }

  public double getY ()
  {
    return y;
  }

  public double lengthOfPoint (Point other)
  {
    return Math.sqrt(Math.pow((x - other.x), 2) +
                   Math.pow((x - other.y), 2));
  }

  public String toString()
  {
    return "(" + x + "," + y + ")";
  }
}
