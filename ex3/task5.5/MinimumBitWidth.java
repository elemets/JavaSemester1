public class MinimumBitWidth
{
  public static void main(String[] args)
  {
    int inputNo = Integer.parseInt(args[0]);
    int noOfBits = 0;
    int doubleNo = 1;

    while(inputNo > doubleNo)
    {
      noOfBits = noOfBits + 1;
      doubleNo = doubleNo * 2;
    }
    System.out.println("You want " + noOfBits + " bits to represent "
    + inputNo + " values");
  }
}
