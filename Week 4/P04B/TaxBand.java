/* Practical P04B- Question 4
Eryk Gloginski
22/10/2020
Program to tell your tax based on your income and marital status*/

import java.util.Scanner;

public class TaxBand
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double income;
   char maritalStatus, taxBand;

   // prompt for input and take variable
   System.out.println("Enter your income: ");
   income = input.nextDouble();
   System.out.println("Marital status (M for Married, S for Single): ");
   maritalStatus = input.next().charAt(0);
   
   // if else statement
   if(income <= 20000 & maritalStatus == 'S')
   {
      taxBand = 'A';
      System.out.println("Your Tax Band is: " + taxBand);
   }
   else if(income <= 20000 & maritalStatus == 'M')
   {
      taxBand = 'B';
      System.out.println("Your Tax Band is: " + taxBand);
   }
   else if(income > 20000 & maritalStatus == 'S')
   {
      taxBand = 'C';
      System.out.println("Your Tax Band is: " + taxBand);
   }
   else
   {
      taxBand = 'D';
      System.out.println("Your Tax Band is: " + taxBand);
   }
   } // end main method
} // end class
