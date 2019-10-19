public class MoneyMkt{

  private static double annualInterestRate;
  private double moneymktBalance;//checking balance
  private double maintfee;//possible maintenance fee

  public static void ModifyAnnualInterestRate(double newRate)
  {
    annualInterestRate = newRate;//set rate
  }
  MoneyMkt()
  {
    moneymktBalance = 0;
    annualInterestRate =0;
    maintfee=0;
  }

  MoneyMkt(double balance)
  {
    moneymktBalance = balance;//set balance
  }

  public void setMaintFee(double maintenancefee)
  {
    maintfee = maintenancefee;// set maintenance fee
  }
  public double Maintfee()
  {
    return maintfee;//get maintenance fee
  }
  public double GetAnnInt()
  {
    return annualInterestRate;//get annual int
  }

  public double GetMoneyMktBal()
  {
    return moneymktBalance;//get money market balance
  }

  public double Deposit(double deposit)
  {
    moneymktBalance = moneymktBalance + deposit;//update balance
    return moneymktBalance;//deposit amount
  }

  public double Withdraw(double withdraw)
  {
    moneymktBalance = moneymktBalance - withdraw;//update balance
    return moneymktBalance;//subtract withdrawal amount
  }


}
