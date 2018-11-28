public class CompareQuadPoly
{
  public static void main(String[] args)
  {
    //taking inputs for the first and second quadratics
    QuadPoly firstQuadPoly = new QuadPoly(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
    QuadPoly secondQuadPoly = new QuadPoly(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
    // finding if they equal each other

    if (firstQuadPoly.equals(secondQuadPoly))
    {
      System.out.println("The polynomial: " + firstQuadPoly.quadratic + "x^2 + " + firstQuadPoly.linear + "x + " + firstQuadPoly.constant);
      System.out.println("is the same as: " + secondQuadPoly.quadratic + "x^2 + " + secondQuadPoly.linear + "x + " + secondQuadPoly.constant);
    }
      else if (firstQuadPoly.lessThan(secondQuadPoly))
      {
      System.out.println("The polynomial: " + firstQuadPoly.quadratic + "x^2 + " + firstQuadPoly.linear + "x + " + firstQuadPoly.constant);
      System.out.println("is less than: " + secondQuadPoly.quadratic + "x^2 + " + secondQuadPoly.linear + "x + " + secondQuadPoly.constant);
      }
      else
      {
        System.out.println("The polynomial: " + firstQuadPoly.quadratic + "x^2 + " + firstQuadPoly.linear + "x + " + firstQuadPoly.constant);
        System.out.println("is greater than: " + secondQuadPoly.quadratic + "x^2 + " + secondQuadPoly.linear + "x + " + secondQuadPoly.constant);
      }
  }
}
