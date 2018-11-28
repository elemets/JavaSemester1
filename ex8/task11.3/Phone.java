public class Phone
{
  // the name of the phone
  private final String name;

  // The account
  private final Account account;

  // duration of all calls made on phone
  private int durationOfCalls;


  // constructor method
  public Phone (String reqName, Account reqAccount)
  {
    name = reqName;
    account = reqAccount;
  }


  // Call method
  public int callTracker (int reqDuration)
  {
    return durationOfCalls += account.requestToCall(reqDuration);
  }

  public int callAttempt(int reqCallDuration)
  {
    int creditLeft = getCredit();
    int callDuration = callTracker(reqCallDuration);
    if (callDuration <= creditLeft)
    creditLeft -= callDuration;
    else
    {
      callDuration = creditLeft;
      creditLeft = 0;
    }
    return creditLeft;
  }

  // get credit
  public int getCredit()
  {
    return account.getCredit();
  }

  public Account getAccount()
  {
    return account;
  }

  public String toString()
  {
    return "Phone(" + name + "," + durationOfCalls + "," + account.toString() + ")";
  }

  public String getName()
  {
    return name;
  }

}
