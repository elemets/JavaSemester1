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
      System.out.println("The polynomial: " + firstQuadPoly.toString());
      System.out.println("is the same as: " + secondQuadPoly.toString());
    }
      else if (firstQuadPoly.lessThan(secondQuadPoly))
      {
      System.out.println("The polynomial: " + firstQuadPoly.toString());
      System.out.println("is less than: " + secondQuadPoly.toString());
      }
      else
      {
        System.out.println("The polynomial: " + firstQuadPoly.toString());
        System.out.println("is greater than: " + secondQuadPoly.toString());
      }
  }
}
