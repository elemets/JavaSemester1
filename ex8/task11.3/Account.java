public class Account
{

  // name of account
  private final String name;

  // Amount of credit on Account
  private int credit = 0;

  private int timeOnCall = 0;

  public Account (String reqName, int reqCredit)
  {
    name = reqName;
    credit = reqCredit;
  }

  public int topUp (int amount)
  {
    return credit += amount * 100;
  }

  public int requestToCall (int desiredTime)
  {
    int timeOnCall = desiredTime;
    if (timeOnCall > credit)
      timeOnCall = credit;

    credit -= timeOnCall;
    return timeOnCall;
  }

  public int chargeCredit (int chargeReq)
  {
    return credit -= chargeReq;
  }


  public String toString ()
  {
    return "Account(" + name + "," + credit + ")";
  }

  // get credit
  public int getCredit ()
  {
    return credit;
  }

  public String getName()
  {
    return name;
  }

  public int getTimeOnCall()
  {
    return timeOnCall;
  }
}
