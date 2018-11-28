public class AddQuadPoly
{ //main method
  public static void main(String[] args)
  {
    // taking the inputs for the first and second quadratic
     QuadPoly Quadratic1 = new QuadPoly(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));

     QuadPoly Quadratic2 = new QuadPoly(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
     // adding the quadratics together
     QuadPoly QuadraticResult = new QuadPoly(Quadratic1.quadratic + Quadratic2.quadratic,
     Quadratic1.linear + Quadratic2.linear, Quadratic1.constant + Quadratic2.constant);
     //Printing out the results
    System.out.println("Polynomial: " + Quadratic1.toString());
    System.out.println("added to: " + Quadratic2.toString());
    System.out.println("results in: " + QuadraticResult.toString());
  }
}
