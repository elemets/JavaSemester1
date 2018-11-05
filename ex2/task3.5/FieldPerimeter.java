public class FieldPerimeter
{
  public static void main(String[] args)
  {
    int Length;
    int Width;
    Length = Integer.parseInt(args[0]);
    Width = Integer.parseInt(args[1]);
    int TotalFieldLength = Length*2 + Width*2;
    System.out.println("Amount of fenced need is " + TotalFieldLength);
  }
}
