import java.util.Scanner;

public class Test{

    public static void main(String [] args)
    {

      System.out.println("This program will step you through questions that will help find the most suitable account for you.");
      System.out.println("Would you want a savings or day-to-day checking account? (0 for Savings, 1 for day-to-day)");

      Scanner input = new Scanner(System.in);
      int savingsOrChecking= input.nextInt();//Get input from the user for checkings or savings account

      if (savingsOrChecking == 0)//if 0 was inputed
      {
        System.out.println("Would you want a debit card (0 for no, 1 for yes): ");//Debit card only issued to Money market acct

        int dbtCrdOrNot= input.nextInt();

          if (dbtCrdOrNot == 1)//If debit card
          {
            System.out.println("Will you be depositing $5000 or more (0 for no, 1 for yes): ");//5000 or more for Money Market
            int fveThsndOrMore = input.nextInt();

            if (fveThsndOrMore==1)//Create money market if 5000 or more is to be deposited
            {
              System.out.println("Creating a Money Market Account...");
              MoneyMkt moneyMktAcct=new MoneyMkt();
            }

            else//Create savings if less than 5000 to be deposited
            {
              System.out.print("A money market account has to have at least $5000");
              System.out.print("Therefore creating a Savings Account(no debit card)...");
              Savings savingAcct=new Savings();
            }

          }

          else//Create savings account if not debit card
          {
            System.out.println("Creating a Savings Account...");
            Savings savingAcct=new Savings();
          }
      }

      else//if Checking was inputed from first question
      {
        System.out.println("Creating a Checking Account...");
        Checking checkingAcct= new Checking();
      }


      //Phase 3
      double balance1= 2000;
      Savings savingTest= new Savings(balance1);//initializing account with 2000

      double newRate= 0.04;
      savingTest.ModifyAnnualInterestRate(newRate);//sets interest rate

      double compoundingVal= 500;
      double monthlyBalance = savingTest.CalcMonthlyInterest(compoundingVal);//calculates total monthly compounding int for 500
      System.out.println("The new balance with monthly interest is " + monthlyBalance);

      double biWeeklyBalance= savingTest.CalcBiWeeklyInterest(compoundingVal);//calculates total biweekly compounding int for 500
      System.out.println("The new balance with biweekly interest is " + biWeeklyBalance);

  }


}
