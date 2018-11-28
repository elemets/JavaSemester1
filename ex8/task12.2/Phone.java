/**
* This class is the phone which has an account attached to it
* @author Arthur
*/

public class Phone
{
  // the name of the phone
  private final String name;

  // The account
  private final Account account;

  // duration of all calls made on phone
  private int durationOfCalls;


  /** constructor method */
  public Phone (String reqName, Account reqAccount)
  {
    name = reqName;
    account = reqAccount;
  }


  /** Call method */
  public int callTracker (int reqDuration)
  {
    return durationOfCalls += account.requestToCall(reqDuration);
  }

  /**@param reqCallDuration
  *@return creditLeft */
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

  /** @return account.getcredit() */
  public int getCredit()
  {
    return account.getCredit();
  }
  /** @return account */
  public Account getAccount()
  {
    return account;
  }

  /** @return its a string */
  public String toString()
  {
    return "Phone(" + name + "," + durationOfCalls + "," + account.toString() + ")";
  }
  /** @return name*/
  public String getName()
  {
    return name;
  }

}
