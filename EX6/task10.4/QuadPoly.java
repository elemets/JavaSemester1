public class QuadPoly
{
  // defining the nature of the inputs
  public double quadratic;
  public double linear;
  public double constant;
  //constructor method
  public QuadPoly (double reqQuadratic, double reqLinear, double reqConstant)
  {
    quadratic = reqQuadratic;
    linear = reqLinear;
    constant = reqConstant;
  }
  // method to find if they equal each other
  public boolean equals(QuadPoly other)
  {
    return quadratic == other.quadratic && linear == other.linear && constant == other.constant;
  }
  // method to find if they are less than
  public boolean lessThan(QuadPoly other)
  {
    return quadratic < other.quadratic || quadratic == other.quadratic &&
            (linear < other.linear ||
            linear == other.linear && constant < other.constant);

  }

  public String toString()
  {
    return quadratic + "x^2 + " + linear + "x + " + constant;
  }

}
