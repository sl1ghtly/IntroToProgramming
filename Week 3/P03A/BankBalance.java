/* Practical P03A- Question 1
Eryk Gloginski
13/10/2020
Program to take check if your bank balance is in credit*/

import java.util.Scanner;

public class BankBalance
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner keyboardIn = new Scanner(System.in);
   
   // declare variable
   double bankBalance = 0;
   
   // prompt for input and take variable
   System.out.print("Please enter your bank balance: ");
   bankBalance = keyboardIn.nextDouble();
   
   // if statement if balance is bigger than 0, sends message
   if(bankBalance > 0)
   {
      System.out.println("You are in credit");
   }
   
   } // end main method
} // end class
