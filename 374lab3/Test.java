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
              MoneyMkt moneyMktAcct();
            }

            else//Create savings if less than 5000 to be deposited
            {
              System.out.print("A money market account has to have at least $5000");
              System.out.print("Therefore creating a Savings Account(no debit card)...");
              Savings savingAcct();
            }

          }

          else//Create savings account if not debit card
          {
            System.out.println("Creating a Savings Account...");
            Savings savingAcct();
          }
      }
      
      else//if Checking was inputed from first question
      {
        System.out.println("Creating a Checking Account...");
        Checking checkingAcct();
      }
  }

}
