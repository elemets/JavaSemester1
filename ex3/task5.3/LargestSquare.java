public class LargestSquare
{
  public static void main(String[] args)
  {
    int inputNo = Integer.parseInt(args[0]);
    int squareNo = inputNo;

    while(Math.pow(squareNo, 2) > inputNo)
    squareNo = squareNo - 1;

    System.out.println(squareNo + " is the largest square number");
  }
}
