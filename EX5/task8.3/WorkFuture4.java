public class WorkFuture4
{
  // age of retirement method
  private static void ageOfRetirement(int presentYear, int personNumber, int birthYear)
  {
    int yearsWorking = 68 - (presentYear - birthYear); // defining the years worked
    int yearCount = presentYear + 1; // counting the years

    System.out.println("Person" + personNumber + " has " + yearsWorking + " years left to work");
    for (int age = (yearCount - birthYear); age < 68; age++) // for loop for spitting out time till retirement
    {
      yearsWorking = 68 - age; // years working
      System.out.println("In " + yearCount + " Person" + personNumber + " will have " + yearsWorking + " years left to work");
      yearCount++; // iterating yearCount
    }
    // printing when person will retire
    System.out.println("Person" + personNumber + " will retire in " + yearCount);
  }

  public static void main(String[] args)
  {
   // parsing all the integers for use in the ageOfRetirement method
   int presentYear = Integer.parseInt(args[0]);
   int birthYear1 = Integer.parseInt(args[1]);
   int birthYear2 = Integer.parseInt(args[2]);
   int birthYear3 = Integer.parseInt(args[3]);
   int birthYear4 = Integer.parseInt(args[4]);
   // using the pre defined method
   ageOfRetirement(presentYear, 1, birthYear1);
   ageOfRetirement(presentYear, 2, birthYear2);
   ageOfRetirement(presentYear, 3, birthYear3);
   ageOfRetirement(presentYear, 4, birthYear4);
  }
}
