/* Practical P08B- Question 5
Eryk Gloginski
25/11/2020
Program to display the interest yearly but max 15 years.*/

import java.util.Scanner;

public class DisplayInterest
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double deposit = 20;
   int years = 15;
   double earned = 0;
   
   // for loop
   for (int count = 1; count <= years; count++)
   {
      deposit = deposit + (deposit * 0.10);
      System.out.println("Deposit for year " + count + ": " + deposit);
   }
   earned = deposit - 20;
   System.out.println("Deposit earned: " + earned);
   }
}