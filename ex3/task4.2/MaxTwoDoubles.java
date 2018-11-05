public class MaxTwoDoubles
{
  public static void main(String[] args)
  {
    double number1 = Double.parseDouble(args[0]);
    double number2 = Double.parseDouble(args[1]);

    System.out.println("" + number1 + " " + number2);

    if (number1 > number2)
      System.out.println(number1 + " is bigger than " + number2);
    else
      System.out.println(number2 + " is bigger than " + number1);
  }
}

