public class Savings{
  private static double annualInterestRate;
  private double savingsBalance;

  public static void ModifyAnnualInterestRate(double newRate)
  {
    annualInterestRate = newRate;
  }
  
  Savings()
  {
    savingsBalance = 0;
    annualInterestRate =0;
  }

  Savings(double balance)
  {
    savingsBalance = balance;
  }

  public double GetAnnInt()
  {
    return annualInterestRate;
  }

  public double GetSavBal()
  {
    return savingsBalance;
  }

  public double Deposit(double deposit)
  {
    return (savingsBalance + deposit);
  }

  public double Withdraw(double withdraw)
  {
    return (savingsBalance - withdraw);
  }

  public double CalcMonthlyInterest(double compoundingVal)
  {
    double monthint= annualInterestRate / 12;
    double monthIntBalance= compoundingVal * monthint;
    savingsBalance= savingsBalance + monthIntBalance;
    return savingsBalance;
  }

  public double CalcBiWeeklyInterest(double compoundingVal)
  {
		double interest= (1 + annualInterestRate/26);
		double result = (Math.pow(interest, 26))-1;
		double bal = compoundingVal * result;
		savingsBalance = savingsBalance + bal;

		return savingsBalance;
	}
}
