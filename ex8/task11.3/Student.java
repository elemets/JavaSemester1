public class Student
{
  // the name of the student
  private final String name;
  private Phone studentPhone = null;
  private int callDuration = 0;

  //constructor method
  public Student (String reqName)
  {
    name = reqName;
  }

  // getting a phone
  public void getPhone(Phone phoneBought)
  {
    studentPhone = phoneBought;
  }

  // attempt to make a call
  public String makePhoneCall(int desiredTime)
  {
    if (studentPhone == null)
    return "Don't have a phone!";
    else {
    studentPhone.callAttempt(desiredTime);
    return "is making a call for desired " + desiredTime + " seconds";
    }
  }

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

  // Students String
  public String toString()
  {
    return "Student(" + name + "," + studentPhone + ")";
  }
  // get name of student
  public String getName()
  {
    return name;
  }


}
