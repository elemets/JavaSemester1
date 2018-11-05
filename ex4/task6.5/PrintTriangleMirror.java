public class PrintTriangleMirror
{
  public static void main(String[] args)
  {
   int height = Integer.parseInt(args[0]); //Defining height
   int whiteSpace = 0; //Defining whiteSpace

   for (int triCountH = 1; triCountH <= height; triCountH++) //Counting Height
    {
      for(int triCountW = 1; triCountW <= height; triCountW++) //Count Width
      {
       if (whiteSpace >= triCountW)
       {
         System.out.print("   "); //Printing white space
       }
       else
        System.out.print("[_]"); //Blocks
      }
      System.out.println();
      whiteSpace++;
    }
  }
}
