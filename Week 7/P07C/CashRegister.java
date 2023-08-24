/* Practical P07C- Question 2
Eryk Gloginski
20/11/2020
Program to terminate when 0 is entered and calculate how much money is owed. Basically Cash Register.*/

import java.util.Scanner;

public class CashRegister
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double cash;
   double total = 0;
   
   do
   {
      System.out.println("Enter amount paid: ");
      cash = input.nextDouble();
      total = total + cash;
   } while (cash != 0);
   
   if (total < 0)
   {
      System.out.println("Please re-enter cash amount.");
   }
   else
   {
      System.out.println("Amount owed: " + total);
   }
   }
}