public class CalendarHighlight
{
  public static void main(String[] args)
  { // Printing Calendar
    printCalendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
  }
  private static void printCalendar(int monthStartDay, int lastDateInMonth, int highlight)
  {
    // keeping track of which day 1 - 7 is the next to be printed out
    int nextDayColumnToUse = monthStartDay;

    // tracking the next date to be printed out
    int nextDateToPrint = 1;

    // top line of hyphens
    printMonthLineOfHyphens();
    // column Head
    printDayNames();

    // minimum of six rows
    int noOfRowsPrintedSoFar = 0;
    while (nextDateToPrint <= lastDateInMonth || noOfRowsPrintedSoFar < 6)
    {
      // print a row
      System.out.print("|");
      for (int dayColumnNo = 1; dayColumnNo <= 7; dayColumnNo++)
      {
        // printing a space between day columns
        if (dayColumnNo > 1 && nextDateToPrint != highlight)
        System.out.print("    ");
        else if(nextDateToPrint == highlight)
        System.out.print("  ");

        // print either spaces or a date
        if (dayColumnNo != nextDayColumnToUse
        || nextDateToPrint > lastDateInMonth)
          printDateSpace();
        else if (nextDateToPrint != highlight)
        {
          printDate(nextDateToPrint);
          nextDayColumnToUse++;
          nextDateToPrint++;
        } else
        {
          System.out.print(">");
          printDate(nextDateToPrint);
          System.out.print("<");
          nextDayColumnToUse++;
          nextDateToPrint++;
        }

        // else
      } // for

      System.out.println("|");
      noOfRowsPrintedSoFar++;

      nextDayColumnToUse = 1;
    } // while
    printMonthLineOfHyphens();
  }

  private static void printMonthLineOfHyphens()
  {
    System.out.print(" ");
    for (int dayColumnNo = 0; dayColumnNo <= 7; dayColumnNo++)
    {
      if (dayColumnNo > 0)
        System.out.print("-----");
    } // for
    System.out.println("---");
  } // printMonthLineOfHyphens

  // Print the day name headings.
  private static void printDayNames()
  {
    System.out.print("|");
    for (int dayColumnNo = 1; dayColumnNo <= 7; dayColumnNo++)
    {
      if (dayColumnNo > 1)
        System.out.print(" ");
      printDayNames(dayColumnNo);
    } // for
    System.out.println("|");
  } // printDayNames

  private static void printDateSpace()
  {
    System.out.print("  ");
  }

  private static void printDayNames(int dayNo)
  {
    // days are numbered 1 - 7
    switch (dayNo)
    {
      case 1: System.out.print(" Su "); break;
      case 2: System.out.print(" Mo  "); break;
      case 3: System.out.print(" Tu  "); break;
      case 4: System.out.print(" We  "); break;
      case 5: System.out.print(" Th  "); break;
      case 6: System.out.print("Fr  "); break;
      case 7: System.out.print(" Sa "); break;
    }
  }

  private static void printDate(int date)
  {
    System.out.printf("%02d", date);
  }
}
