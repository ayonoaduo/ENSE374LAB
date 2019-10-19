public class Checking{

  private static double annualInterestRate;
  private double checkingBalance;//checking balance
  private double maintfee;//possible maintenance fee

  public static void modifyAnnualInterestRate(double newRate)
  {
    this.annualInterestRate = newRate;//set rate
  }

  Checking(double balance)
  {
    this.checkingBalance = balance;//set balance
  }

  Checking(double maintfee)
  {
    this.maintfee = maintfee;// set maintenance fee
  }
  public double maintfee()
  {
    return maintfee;
  }
  public double getAnnInt()
  {
    return annualInterestRate;//get annual int
  }

  public double getCheckBal()
  {
    return checkingBalance;//get checking balance
  }

  public double deposit(double deposit)
  {
    this.checkingBalance = checkingBalance + deposit;//update balance
    return (checkingBalance + deposit);//deposit amount
  }

  public double withdraw(double withdraw)
  {
    this.checkingBalance = checkingBalance - withdraw;//update balance
    return (checkingBalance - withdraw);//subtract withdrawal amount
  }


}
