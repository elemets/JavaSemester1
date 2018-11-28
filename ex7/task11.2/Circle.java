public class Circle
{

  // variable definitions
  private Point centre;
  private double radius;

  private Point shiftedCentre;
  private double shiftedRadius;

  // constructor Method
  public Circle(Point reqCentre, double reqRadius)
  {
    centre = reqCentre;
    radius = reqRadius;
  }

  // area circle
  public double area()
  {
    return Math.PI * (Math.pow(radius, 2));
  }

  // circle perimeter
  public double perimeter ()
  {
    return Math.PI * 2 * radius;
  }

  public Circle shift(double reqXShift, double reqYShift)
  {
    return new Circle (centre.shift(reqXShift, reqYShift),radius);
  }

  public String toString()
  {
          return "Circle(" + centre + "," + radius + ")";
  }
}
