public class Triangle
{

    // variable definitons
    private final Point triA;
    private final Point triB;
    private final Point triC;


    // constructor method
    public Triangle (Point reqTriA, Point reqTriB, Point reqTriC)
    {
      triA = reqTriA;
      triB = reqTriB;
      triC = reqTriC;
    }

    public double perimeter ()
    {
      return (triA.lengthOfPoint(triB) + triB.lengthOfPoint(triC) + triC.lengthOfPoint(triA));
    }

    public double area ()
    {

      double s = (triA.lengthOfPoint(triB) + triB.lengthOfPoint(triC) + triC.lengthOfPoint(triA)) /2;

      return Math.sqrt(s * (s - triA.lengthOfPoint(triB)
      * (s - triB.lengthOfPoint(triC)) * (s - triC.lengthOfPoint(triA))));

      }

    public Triangle shift(double reqXShift, double reqYShift)
    {

      return new Triangle (triA.shift(reqXShift, reqYShift),
      triB.shift(reqXShift, reqYShift), triC.shift(reqXShift, reqYShift));
    }

    public String toString ()
    {
      return "Triangle(" + triA + "," + triB + "," + triC + ")";
    }
}
