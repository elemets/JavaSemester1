public class ThreeWeights
{
  public static void main(String[] args)
  {
    int weight1 = Integer.parseInt(args[0]);
    int weight2 = Integer.parseInt(args[1]);
    int weight3 = Integer.parseInt(args[2]);


    System.out.println((weight1 * -1) + (weight2 * -1) + (weight3 * -1));
    System.out.println((weight1 * -1) + (weight2 * -1) + (weight3 * 0));
    System.out.println((weight1 * -1) + (weight2 * -1) + (weight3 * 1));

    System.out.println((weight1 * -1) + (weight2 * 0) + (weight3 * -1));
    System.out.println((weight1 * -1) + (weight2 * 0) + (weight3 * 0));
    System.out.println((weight1 * -1) + (weight2 * 0) + (weight3 * 1));

    System.out.println((weight1 * -1) + (weight2 * 1) + (weight3 * -1));
    System.out.println((weight1 * -1) + (weight2 * 1) + (weight3 * 0));
    System.out.println((weight1 * -1) + (weight2 * 1) + (weight3 * 1));


    System.out.println((weight1 * 0) + (weight2 * -1) + (weight3 * -1));
    System.out.println((weight1 * 0) + (weight2 * -1) + (weight3 * 0));
    System.out.println((weight1 * 0) + (weight2 * -1) + (weight3 * 1));

    System.out.println((weight1 * 0) + (weight2 * 0) + (weight3 * -1));
    System.out.println((weight1 * 0) + (weight2 * 0) + (weight3 * 0));
    System.out.println((weight1 * 0) + (weight2 * 0) + (weight3 * 1));

    System.out.println((weight1 * 0) + (weight2 * 1) + (weight3 * -1));
    System.out.println((weight1 * 0) + (weight2 * 1) + (weight3 * 0));
    System.out.println((weight1 * 0) + (weight2 * 1) + (weight3 * 1));


    System.out.println((weight1 * 1) + (weight2 * -1) + (weight3 * -1));
    System.out.println((weight1 * 1) + (weight2 * -1) + (weight3 * 0));
    System.out.println((weight1 * 1) + (weight2 * -1) + (weight3 * 1));

    System.out.println((weight1 * 1) + (weight2 * 0) + (weight3 * -1));
    System.out.println((weight1 * 1) + (weight2 * 0) + (weight3 * 0));
    System.out.println((weight1 * 1) + (weight2 * 0) + (weight3 * 1));

    System.out.println((weight1 * 1) + (weight2 * 1) + (weight3 * -1));
    System.out.println((weight1 * 1) + (weight2 * 1) + (weight3 * 0));
    System.out.println((weight1 * 1) + (weight2 * 1) + (weight3 * 1));
  }
}

