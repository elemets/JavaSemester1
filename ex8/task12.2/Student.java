/**
* This class is the student class this contains most of the logic for the program
* @author Arthur
*/

public class Student
{
  // the name of the student
  private final String name;
  private Phone studentPhone = null;
  private int callDuration = 0;

  /** @param reqName @return name */
  public Student (String reqName)
  {
    name = reqName;
  }

  /** @param phoneBought @return StudentPhone */
  public void getPhone(Phone phoneBought)
  {
    studentPhone = phoneBought;
  }
  /** @param desiredTime  @return a string */
  public String makePhoneCall(int desiredTime)
  {
    if (studentPhone == null)
    return "Don't have a phone!";
    else {
    studentPhone.callAttempt(desiredTime);
    return "is making a call for desired " + desiredTime + " seconds";
    }
  }
  /** @param reqTopUp @return String */
  public String topUp(int reqTopUp)
  {
    if (studentPhone == null)
    return ("Don't have a phone!");
    else
    {
    Account currentAccount = studentPhone.getAccount();
    currentAccount.topUp(reqTopUp);
    return "is topping up by " + reqTopUp;
    }
  }

  /** @param ? @return Student name ...  */
  public String toString()
  {
    return "Student(" + name + "," + studentPhone + ")";
  }

  /** @param ? @return name  */
  public String getName()
  {
    return name;
  }


}
