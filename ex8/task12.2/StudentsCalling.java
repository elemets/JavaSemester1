/**
* This is the Students Calling class and contains all the printing
* as well as the main method.
* @author Arthur
*/

public class StudentsCalling
{
  public static void main(String[] args)
  {
    Student Student1 = new Student("On call Omar");
    Account Account1 = new Account("Lyca", 0);
    Phone Phone1 = new Phone("NANdroid", Account1);
    System.out.println("Creating student " + Student1.getName());
    System.out.println("Result:");
    System.out.println(Student1.toString());
    System.out.println();
    System.out.println("Trying to top up without a phone!");
    System.out.println(Student1.topUp(20));
    System.out.println("Trying to call without a phone!");
    System.out.println(Student1.makePhoneCall(300));
    System.out.println();
    System.out.println(Student1.toString());
    Student1.getPhone(Phone1);
    System.out.println("is buying " + Phone1.getName());
    System.out.println("with account " + Account1.getName());
    System.out.println("Result:");
    System.out.println(Student1.toString());
    System.out.println();
    System.out.println(Student1.toString());
    System.out.println(Student1.topUp(4));
    System.out.println("Result:");
    System.out.println(Student1.toString());
    System.out.println();
    System.out.println(Student1.toString());
    System.out.println(Student1.makePhoneCall(100));
    System.out.println(Student1.toString());
  }
}
