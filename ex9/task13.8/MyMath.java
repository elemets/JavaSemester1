public class MyMath
{
  public static int greatestCommonDivisor (int multipleOfGCD1, int multipleOfGCD2)
  {
    // loop to work out the GCD
    while (multipleOfGCD1 != multipleOfGCD2)
      if (multipleOfGCD1 > multipleOfGCD2)
        multipleOfGCD1 -= multipleOfGCD2;
      else
      multipleOfGCD2 -= multipleOfGCD1;
    return multipleOfGCD1; // return the GCD to the method
  }
}
