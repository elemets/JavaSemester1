public class WorkFuture
{
  public static void main(String[] args)
  {
    int presentYear = Integer.parseInt(args[0]); // This is the present year
    int birthYear = Integer.parseInt(args[1]); // This is the year the user was born
    int yearsWorking = 68 - (presentYear - birthYear); // How long the user has left working
    int yearCount = presentYear + 1; // This is the count I used for the for loop

    System.out.println("You have " + yearsWorking + " years left to work"); //printing how long the user has to work in present year

    for (int age = (yearCount - birthYear); age < 68; age = age + 1) // iterating the age to see how long the user has left to work in different years
    {
      yearsWorking = 68 - age; // how many years user has left to work according to what their age would be that year
      System.out.println("In " + yearCount + " you will have " + yearsWorking + " years left to work"); // printing out this info
      yearCount = yearCount + 1; // year count
    }

    System.out.println("You will retire in " + yearCount); // Printing out my retirement year
  }
}
