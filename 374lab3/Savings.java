public class Savings{
  private static double annualInterestRate;
  private double savingsBalance;

  public static void modifyAnnualInterestRate(double newRate)
  {
    annualInterestRate = newRate;
  }

  Savings(double balance)
  {
    savingsBalance = balance;
  }

  double getAnnInt()
  {
    return annualInterestRate;
  }

  double getSavBal()
  {
    return savingsBalance;
  }

  public double deposit(double deposit)
  {
    return (savingsBalance + deposit);
  }

  public double withdraw(deposit withdraw)
  {
    return (savingsBalance - withdraw);
  }

  public double calcMonthlyInterest()
  {
    double monthint= annualInterestRate / 12;
    double monthIntBalance= savingsBalance * monthint;
    savingsBalance= savingsBalance - monthIntBalance;
    return savingsBalance;
  }

  public double calcBiWeeklyInterest()
  {
		double interest= (1 + annualInterestRate/26);
		double result = (Math.pow(interest, 26))-1;
		double bal = savingsBalance * result;
		savingsBalance = savingsBalance - bal;

		return savingsBalance;
	}
}
