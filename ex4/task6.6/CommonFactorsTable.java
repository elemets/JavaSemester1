public class CommonFactorsTable
{
  public static void main(String[] args)
  {


    //Top line
    //Left side, 5 characters for row labels
    System.out.print("|-----|");
    //Above the column headings
    for(int column = 2; column <= 20; column++)
      // 3 characters for each column
      System.out.print("---");
    //The right side
    System.out.println("-|");

    //Column headings
    System.out.print("|     |");
    for(int column = 2; column <= 20; column++)
      //Need to make column number occup the right number of characters
      if (column < 10)
        System.out.print("  " + column);
      else
        System.out.print(" " + column);
    System.out.println(" |");
    // Sorting the spacing for the column
    System.out.print("|-----|");
    for (int column =2; column <= 20; column++)
      System.out.print("---");
    System.out.println("-|");


    for (int row = 2; row <= 20; row++)
    {
        if (row < 10)
          System.out.print("|   " + row + " |");
        else
          System.out.print("|  " + row + " |");


          // this is for working out the GCD and filling in the table
      for (int column = 2; column <= 20; column++)
      {
            int multipleOfGCD1 = column;
            int multipleOfGCD2 = row;
        while (multipleOfGCD1 != multipleOfGCD2)
          if (multipleOfGCD1 > multipleOfGCD2)
            multipleOfGCD1 -= multipleOfGCD2;
          else
          multipleOfGCD2 -= multipleOfGCD1;

        // this is filling the table on the condition of the GCD being 1 or not
      if (multipleOfGCD1 == 1)
         System.out.print("--|");
      else
        System.out.print("--#");
      }
      System.out.println(" |");
    }
    System.out.print("|-----|");
    for(int column = 2; column <= 20; column++)
      System.out.print("---");
    System.out.println("-|");
  }
}
