/* Practical P06B- Question 1
Eryk Gloginski
11/11/2020
Pseudocode + Java Program*/

/*

GET type
GET balance
GET transactions

IF type = S or s
   charge = 0 
   IF balance < 100
      charge = 25
   ELSE
      charge = 0
   
   interest = 4%
   CALC interest
   fees = 0
   
   DISPLAY type
   DISPLAY balance
   DISPLAY charges interest
   DISPLAY finalbalance
   
ELSE IF type = S or s
   charge = 0 
   IF balance < 100
      charge = 10
   ELSE
      charge = 0
   
   IF balance > 5100
      interest = 3%
      CALC interest
   ELSE
      interest = 5%
      CALC interest
      
   IF transactions > 100
      fees = 10 cent
      CALC fees
   ELSE IF transactions < 100 AND > 50
      fees = 20 cent
      CALC fees
   ELSE
      fees = 0 cent
      
   CALC finalbalance
   
   DISPLAY type
   DISPLAY balance
   DISPLAY charges interest fees
   DISPLAY finalbalance

*/

import java.util.Scanner;

public class SavingsCurrent
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   char accountType;
   double currentBalance, charges, interest, fees, interestCharge, feesCharge, chargeCharge, finalBalance;
   int numberOfTransactions;
   
   // prompt for input and take variable
   System.out.println("Choose account type [S] for Savings, [C] for Current: ");
   accountType = input.next().charAt(0);
   System.out.println("What is your current balance? ");
   currentBalance = input.nextDouble();
   System.out.println("How many transactions do you have on record? ");
   numberOfTransactions = input.nextInt();
   
   // savings
   if (accountType == 'S' || accountType == 's')
   {
      charges = 0;
      if (currentBalance < 100)
      {
         charges = 25;
      }
      else
      {
         charges = 0;
      }
      
      interest = 0.04;
      interestCharge = interest * currentBalance;
      fees = 0;
      
      finalBalance = (currentBalance - charges - fees) + interestCharge;
      
      System.out.println("Account Type: " + accountType);
      System.out.println("Current Balance: " + currentBalance);
      System.out.println("Fees to pay: " + charges + " | " + interestCharge + " NO ADDITIONAL FEES");
      System.out.println("Final Balance: " + finalBalance);

   }
   
   // current
   else if (accountType == 'C' || accountType == 'c')
   {
      feesCharge = 0;
      interestCharge = 0;
      charges = 0;
      if (currentBalance < 100)
      {
         charges = 10;
      }
      else
      {
         charges = 0;
      }
      
      interest = 0;
      if (currentBalance > 5100)
      {
         interest = 0.03;
         interestCharge = interest * currentBalance;
      }
      else
      {
         interest = 0.05;
         interestCharge = interest * currentBalance;
      }
      
      fees = 0;
      if (numberOfTransactions > 100)
      {
         fees = 0.10;
         feesCharge = fees * numberOfTransactions;
      }
      else if (numberOfTransactions <= 100 && numberOfTransactions >= 50)
      {
         fees = 0.20;
         feesCharge = fees * numberOfTransactions;
      }
      else
      {
         fees = 0;
      }
      
      finalBalance = (currentBalance - charges - feesCharge) + interestCharge;
      
      System.out.println("Account Type: " + accountType);
      System.out.println("Current Balance: " + currentBalance);
      System.out.println("Fees to pay: " + charges + " | " + interestCharge + " | " + feesCharge);
      System.out.println("Final Balance: " + finalBalance);
   }
   else
   {
      System.out.println("Invalid Option! ");
   }
   
   
   
   }
}