public class DegreeCategory
{
  public static void main(String[] args)
  {
   double AssessmentMark = Double.parseDouble(args[0]);

   if (AssessmentMark >= 70.0)
     System.out.println("Honours, first class");
   else if (AssessmentMark >= 60)
     System.out.println("Honours, second class, division one");
   else if (AssessmentMark >= 50)
      System.out.println("Honours, second class, division two");
   else if (AssessmentMark >= 40)
      System.out.println("Honours, Third class degree");
   else if (AssessmentMark >= 32)
      System.out.println("Pass / ordinary degree");
   else
      System.out.println("Fail");
  }
}
