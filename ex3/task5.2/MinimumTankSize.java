public class MinimumTankSize
{
  public static void main(String[] args)
  {

   double reqVolume = Double.parseDouble(args[0]);
   double sideLength = 0.1;

   while (sideLength * sideLength * sideLength < reqVolume)
     sideLength = sideLength + 1;
     System.out.println("You need a tank of " + sideLength + " metres per side to hold the volume "
     + reqVolume + " cubic metres");
  }
}
