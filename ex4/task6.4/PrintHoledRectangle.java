public class PrintHoledRectangle
{
  public static void main(String[] args)
  {
    // defining width and height as the two arguments
    int width = Integer.parseInt(args[0]);
    int height = Integer.parseInt(args[1]);
    int columnCount = 0;
    int rowCount = 0;

    // checking if width or height are even using their remainder
    // if their remainder = 0 then its an even number which means no centre
    if (width % 2 == 0)
    width++;
    if (height % 2 == 0)
    height++;
    // for loop for rows
    for (int row = 1; row <= height; row++) //incremements row number
    {
      for (int column = 1; column <= width; column++) // for loop for columns
      {
        if (columnCount == ((width * height) / 2))
        System.out.print("   "); // adds a space if its going to be in the middle
        else
        System.out.print("[_]"); // otherwise just prints a block
        columnCount++;
      }
    System.out.println(); // prints a new line
    rowCount++; // adds to the row count (this was here for bug fixing)
    }
  }
}
