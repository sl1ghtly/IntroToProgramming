/* Practical P09B- Question 5
Eryk Gloginski
02/12/2020
Program to ask to enter/withdraw/view balance continously.*/

import java.util.Scanner;

public class DepositMoney
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double balance = 0;
   double deposit = 0;
   double withdraw = 0;
   char answer = ' ';
   double finalBalance;
   int depositCounter = 0;
   int withdrawCounter = 0;
   
   // do while loop
   do
   {
      System.out.println("Would you like to deposit, withdraw or view your balance? (D, W or B) ");
      answer = input.next().charAt(0);
      
      switch (answer)
      {
         case 'D':
         case 'd':
            System.out.println("Enter amount to deposit.");
            deposit = input.nextDouble();
            balance = balance + deposit;
            depositCounter++;
            break;
         case 'W':
         case 'w':
            System.out.println("Enter amount to withdraw.");
            withdraw = input.nextDouble();
            if (withdraw < balance)
            {
               balance = balance - withdraw;
               System.out.println("Successfully withdrew: " + withdraw);
               withdrawCounter++;
            }
            else
            {
               System.out.println("Insufficient balance in your account to withdraw this amount: " + withdraw);
            }
            break;
         case 'B':
         case 'b':
            System.out.println("Your current balance: " + balance);
            break;
         case 'Q':
         case 'q':
            System.out.println("Exiting...");
            break;
         default:
            System.out.println("Invalid Option.");
      }
      
   }while (answer != 'Q' && answer != 'q');
   finalBalance = balance;
   System.out.println("Final Balance: " + finalBalance);
   System.out.println("Deposits Made: " + depositCounter);
   System.out.println("Withdrawals Made: " + withdrawCounter);
   }
}