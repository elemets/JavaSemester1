public class Rectangle
{

  // defining points
  private Point recA;
  private Point recB;
  private Point recD;
  private Point recC;


  // constructor method
  public Rectangle(Point reqRecA, Point reqRecB)
  {
    recA = reqRecA;
    recB = reqRecB;
    recC = new Point(recA.getX(), recB.getY());
    recD = new Point(recB.getX(), recA.getY());

  }


  public double perimeter()
  {
    return recA.lengthOfPoint(recB) + recB.lengthOfPoint(recC) +
    recC.lengthOfPoint(recD) + recD.lengthOfPoint(recA);
  }

  public double area()
  {
    return recA.lengthOfPoint(recB) * recB.lengthOfPoint(recC);
  }

  public Rectangle shift (double reqXShift, double reqYShift)
  {
    Point shiftedRecA = recA.shift(reqXShift, reqYShift);
    Point shiftedRecB = recB.shift(reqXShift, reqYShift);

    return new Rectangle (shiftedRecA, shiftedRecB);
  }

  public String toString()
  {
    return "Rectangle(" + recA + "," + recB + "," + recC + "," + recD + ")";
  }
}
