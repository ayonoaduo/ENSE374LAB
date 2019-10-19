public class Savings{
  private static double annualInterestRate;
  private double savingsBalance;

  public static void modifyAnnualInterestRate(double newRate)
  {
    this.annualInterestRate = newRate;
  }

  Savings(double balance)
  {
    this.savingsBalance = balance;
  }

  public double getAnnInt()
  {
    return this.annualInterestRate;
  }

  public double getSavBal()
  {
    return this.savingsBalance;
  }

  public double deposit(double deposit)
  {
    return (savingsBalance + deposit);
  }

  public double withdraw(double withdraw)
  {
    return (savingsBalance - withdraw);
  }

  public double calcMonthlyInterest(double compoundingVal)
  {
    double monthint= annualInterestRate / 12;
    double monthIntBalance= compoundingVal * monthint;
    savingsBalance= savingsBalance + monthIntBalance;
    return savingsBalance;
  }

  public double calcBiWeeklyInterest(double compoundingVal)
  {
		double interest= (1 + annualInterestRate/26);
		double result = (Math.pow(interest, 26))-1;
		double bal = compoundingVal * result;
		savingsBalance = savingsBalance + bal;

		return savingsBalance;
	}
}
