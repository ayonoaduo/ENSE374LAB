public class Checking{

  private static double annualInterestRate;
  private double checkingBalance;//checking balance
  private double maintfee;//possible maintenance fee

  public static void ModifyAnnualInterestRate(double newRate)
  {
    annualInterestRate = newRate;//set rate
  }

  Checking()
  {
    checkingBalance = 0;
    annualInterestRate =0;
    maintfee=0;
  }

  Checking(double balance)
  {
    checkingBalance = balance;//set balance
  }

  public void setMaintFee(double maintenancefee)
  {
    maintfee = maintenancefee;// set maintenance fee
  }
  public double Maintfee()
  {
    return maintfee;
  }
  public double GetAnnInt()
  {
    return annualInterestRate;//get annual int
  }

  public double GetCheckBal()
  {
    return checkingBalance;//get checking balance
  }

  public double Deposit(double deposit)
  {
    checkingBalance = checkingBalance + deposit;//update balance
    return checkingBalance;//deposit amount
  }

  public double Withdraw(double withdraw)
  {
    checkingBalance = checkingBalance - withdraw;//update balance
    return checkingBalance;//subtract withdrawal amount
  }


}
