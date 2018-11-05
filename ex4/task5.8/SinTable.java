public class SinTable
{
  public static void main(String[] args)
  {
   int tableStart = Integer.parseInt(args[0]);
   int noSteps = Integer.parseInt(args[1]);
   int tableEnd =  Integer.parseInt(args[2]);


   System.out.println("------------------------------------------");
   System.out.println("| Sin table from " + tableStart + " to " + tableEnd +
                      " in steps of " + noSteps);
   System.out.println("------------------------------------------");

   for (int steps = 0; steps <= tableEnd; steps = steps + Integer.parseInt(args[1]))
   System.out.println("| sin(" + steps + ") = " + Math.sin(Math.toRadians(steps)));

   System.out.println("------------------------------------------");
  }
}
