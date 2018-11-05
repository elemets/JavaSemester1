public class PassFailDistinction
{
  public static void main(String[] args)
  {
    double PostGradMark = Double.parseDouble(args[0]);

    if (PostGradMark >= 50)
    System.out.println("Pass");
    else
    System.out.println("Fail");
    if (PostGradMark >= 70)
    System.out.println("Distinction");
  }
}
