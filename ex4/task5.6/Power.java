public class Power
{
  public static void main(String[] args)
  {
   int number1 = Integer.parseInt(args[0]);
   int number2 = Integer.parseInt(args[1]);
   int numberStr = number1;

   for (int count= 1; count < number2; count = count + 1)
   numberStr = numberStr * number1;

   System.out.println(numberStr);
  }
}
