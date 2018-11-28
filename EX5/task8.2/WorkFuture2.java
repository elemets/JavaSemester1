public class WorkFuture2
{
  public static void main(String[] args)
  {
    int presentYear = Integer.parseInt(args[0]); // This is the present year
    int person1Year = Integer.parseInt(args[1]);
    int person2Year = Integer.parseInt(args[2]); // This is the year the user was born

    int yearsWorking1 = 68 - (presentYear - person1Year);
    int yearsWorking2 = 68 - (presentYear - person2Year); // How long the user has left working

    int yearCount = presentYear + 1; // This is the count I used for the for loop
    int yearCount2 = presentYear + 1;

    System.out.println("Person 1 has " + yearsWorking1 + " years left to work"); //printing how long the user has to work in$
    for (int age = (yearCount - person1Year); age < 68; age++) // iterating the age to see how long the user has $
     {
      yearsWorking1 = 68 - age; // how many years user has left to work according to what their age would be that year
      System.out.println("In " + yearCount + " Person 1 will have " + yearsWorking1 + " years left to work"); // printing out$
      yearCount++; // year count
     }

    System.out.println("Person 1 will retire in " + yearCount);

    // person 2 loop
    System.out.println("Person 2 has " + yearsWorking1 + " years left to work"); //printing how long the user has to work in$
    for (int age = (yearCount2 - person2Year); age < 68; age++) // iterating the age to see how long the user has $
     {
      yearsWorking2 = 68 - age; // how many years user has left to work according to what their age would be that year
      System.out.println("In " + yearCount2 + " Person 2 will have " + yearsWorking2 + " years left to work"); // printing out$
      yearCount2++; // year count
     }

    System.out.println("Person 2 will retire in " + yearCount2);
     // Printing out my retirement year
  }
}
