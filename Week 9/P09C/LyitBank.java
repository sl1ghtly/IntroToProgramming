/* Practical P09Q- Question 1
Eryk Gloginski
04/12/2020
Program for the LYIT Bank.*/

import java.util.Scanner;

public class LyitBank
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double balance = 0;
   double deposit = 0;
   double withdraw = 0;
   double loanAmount = 0;
   double loanIntrest = 0;
   double payback = 0;
   double paybackMonthly = 0;
   int answer;
   int loanMonths = 0;
   int depositCounter = 0;
   int withdrawCounter = 0;
   
   // do while loop
   do
   {
      System.out.println("Welcome to LYIT Bank ");
      System.out.println("1. View Balance");
      System.out.println("2. Make a deposit");
      System.out.println("3. Make a withdrawal");
      System.out.println("4. View number of transactions made");
      System.out.println("5. See how much a loan would cost you");
      System.out.println("6. Exit");
      answer = input.nextInt();
      
      switch (answer)
      {
         // display balance
         case 1:
            System.out.println("Your current balance: " + balance);
            System.out.println();
            break;
         // deposit amount
         case 2:
            System.out.println("How much do you want to deposit? ");
            deposit = input.nextDouble();
            balance = balance + deposit;
            System.out.println("Successfully deposited: " + deposit);
            depositCounter++;
            System.out.println();
            break;
         // withdraw amount lower or equal to balance
         case 3:
            System.out.println("How much do you want to withdraw? ");
            withdraw = input.nextDouble();
            if (withdraw < balance)
            {
               balance = balance - withdraw;
               System.out.println("Successfully withdrew: " + withdraw);
               withdrawCounter++;
               System.out.println();
            }
            else
            {
               System.out.println("Insufficient funds - today you can withdraw up to " + balance);
               System.out.println();
            }
            break;
         // display deposits and withdrawals made
         case 4:
            System.out.println("Deposits Made: " + depositCounter);
            System.out.println("Withdrawals Made: " + withdrawCounter);
            System.out.println();
            break;
         // display potential loan
         case 5:
            System.out.println("Enter a loan amount: ");
            loanAmount = input.nextDouble();
            System.out.println("Enter number of months to pay it back: ");
            loanMonths = input.nextInt();
            System.out.println("Loan Amount: " + loanAmount);
            loanIntrest = loanAmount * 0.05;
            payback = loanAmount + loanIntrest;
            paybackMonthly = payback / loanMonths;
            System.out.println("Total Intrest: " + loanIntrest);
            System.out.println("Loan Payment Schedule: ");
            System.out.println("Month\tPayment\tBalance");
            for (int count = 1; count <= loanMonths; count++)
            {
               payback = payback - paybackMonthly;
               System.out.println(count + "\t\t" + paybackMonthly + "\t\t" + payback);
            }
            System.out.println();
            break;
         // exit the loop
         case 6:
            System.out.println("You have chosen Exit. Have a nice day! ");
            break;
         // display invalid option
         default:
            System.out.println("Invalid Option. ");
            System.out.println();
      }
      
   }while (answer != 6);
   }
}