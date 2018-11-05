public class MaxList
{
  public static void main(String[] args)
  {
    double firstNumber = Double.parseDouble(args[0]); // Defining Double
    double maxSoFar = firstNumber;
    double indexCount = 0; //Index count

    for (int argIndex = 0; argIndex < args.length; argIndex++) // looping through args
    {
      double currentNumber = Double.parseDouble(args[argIndex]);
      if (currentNumber > maxSoFar) // checking max vs current
      {
       maxSoFar = currentNumber;
       indexCount = argIndex;
     } //close if
    } // close for
    System.out.println(maxSoFar); //printing the max number
    System.out.println(indexCount); //printing the index
  }
}
