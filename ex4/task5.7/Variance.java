public class Variance
{
  public static void main(String[] args)
  {

   int sumSoFar = Integer.parseInt(args[0]);
   double sumVar = 0;

   for (int argIndex = 1; argIndex < args.length; argIndex = argIndex + 1)
     sumSoFar = sumSoFar + Integer.parseInt(args[argIndex]);

   double theMean = sumSoFar / (double) args.length;
   System.out.println("The mean average is " + theMean);


   for (int argIndex = 0; argIndex < args.length; argIndex = argIndex + 1)
   sumVar = sumVar + Math.pow(theMean - Integer.parseInt(args[argIndex]), 2) ;

   System.out.println("The variance is " + sumVar / args.length );

  }
}
