public class RoundPennies
{
  public static void main(String[] args)
  {
    int pennies = Integer.parseInt(args[0]);

    System.out.println("The number of pounds you have is " + (pennies + 50) / 100);

  }
}
