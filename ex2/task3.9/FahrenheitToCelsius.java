public class FahrenheitToCelsius
{
  public static void main(String[] args)
  {
    double temp = Double.parseDouble(args[0]);

    System.out.println("The temperature in Celsius is " + ((temp - 32) / (1.8)));

  }
}
