/* Practical P04B- Question 2
Eryk Gloginski
22/10/2020
Program to tell if your account is overdrawn or in credit*/

import java.util.Scanner;

public class ReadBalance
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double accountBalance, overDrawn;

   // prompt for input and take variable
   System.out.println("Enter your account balance: ");
   accountBalance = input.nextDouble();
   
   // if else statement
   if(accountBalance < 0)
   {
      overDrawn = 0 + accountBalance;
      System.out.println("Your account is overdrawn by " + overDrawn + " euro");
   }
   else
   {
      System.out.println("Your account is in credit by " + accountBalance + " euro");
   }
   } // end main method
} // end class
