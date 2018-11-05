public class SumOfCubedDigits
{
  public static void main(String[] args)
  {

    for(int loopNumber1 = 1; loopNumber1 <= 9; loopNumber1++)
    {
      for(int loopNumber2 = 0; loopNumber2 <= 9; loopNumber2++)
      {
        for (int loopNumber3 = 0; loopNumber3 <= 9; loopNumber3++)
        {
          //
        int cubedNos =  (int)Math.pow(loopNumber3, 3) + (int)Math.pow(loopNumber2, 3) + (int)Math.pow(loopNumber1, 3);

        String strAdd = "" + loopNumber1 + loopNumber2 + loopNumber3;

        int compareNo = Integer.parseInt(strAdd);
        if(cubedNos == compareNo)
        System.out.println(compareNo);
        }
      }
    }
  }
}
