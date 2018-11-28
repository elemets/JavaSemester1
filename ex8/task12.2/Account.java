/**
* This class is the account class for the students calling exercise
* @author Arthur

*/

public class Account
{

  // name of account
  private final String name;

  // Amount of credit on Account
  private int credit = 0;

  private int timeOnCall = 0;
/** @param reqName @param reqCredit */
  public Account (String reqName, int reqCredit)
  {
    name = reqName;
    credit = reqCredit;
  }
/** @param amount @return credit  */
  public int topUp (int amount)
  {
    return credit += amount * 100;
  }
/** @param desiredTime @return timeOnCall  */
  public int requestToCall (int desiredTime)
  {
    int timeOnCall = desiredTime;
    if (timeOnCall > credit)
      timeOnCall = credit;

    credit -= timeOnCall;
    return timeOnCall;
  }

  /** @return the charge of credit */

  public int chargeCredit (int chargeReq)
  {
    return credit -= chargeReq;
  }

  /** @return the Account but in string format */
  public String toString ()
  {
    return "Account(" + name + "," + credit + ")";
  }

  /**  @return get credit */
  public int getCredit ()
  {
    return credit;
  }
/** @param ? @return name */
  public String getName()
  {
    return name;
  }
/** @param ? @return timeOnCall  */
  public int getTimeOnCall()
  {
    return timeOnCall;
  }
}
