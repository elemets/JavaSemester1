public class YearsBeforeRetirement
{
  public static void main(String[] args)
  {
    int MyAge;
    MyAge = Integer.parseInt(args[0]);
    int RetirementAge = 68;
    int YearsWorking = RetirementAge - MyAge;
    System.out.println("My age is " + MyAge);
    System.out.println("The age I will retire is " + RetirementAge);
    System.out.println("Years left working " + YearsWorking);
  }
}
