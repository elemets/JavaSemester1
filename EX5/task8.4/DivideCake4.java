public class DivideCake4
{
  // method to work out the GCD of two numbers
  private static int greatestCommonDivisor (int multipleOfGCD1, int multipleOfGCD2)
  {
    // loop to work out the GCD
    while (multipleOfGCD1 != multipleOfGCD2)
      if (multipleOfGCD1 > multipleOfGCD2)
        multipleOfGCD1 -= multipleOfGCD2;
      else
      multipleOfGCD2 -= multipleOfGCD1;
    return multipleOfGCD1; // return the GCD to the method
  }
  public static void main(String[] args)
  {
    int age1 = Integer.parseInt(args[0]);
    int age2 = Integer.parseInt(args[1]);
    int age3 = Integer.parseInt(args[2]);
    int age4 = Integer.parseInt(args[3]);

    int GCD1 = greatestCommonDivisor(age1, age2);
    int GCD2 = greatestCommonDivisor(age3, age4);

    int portions1 = age1 / greatestCommonDivisor(GCD1, GCD2);
    int portions2 = age2 / greatestCommonDivisor(GCD1, GCD2);
    int portions3 = age3 / greatestCommonDivisor(GCD1, GCD2);
    int portions4 = age4 / greatestCommonDivisor(GCD1, GCD2);

    System.out.println("The " + age1 + " year old gets " + portions1 + " portions. " +
    "The " + age2 + " year old gets " + portions2 + " portions. The " + age3 +
    " year old gets " + portions3 + " portions. The " + age4 + " year old gets "
    + portions4 + " portions." );
  }
}
