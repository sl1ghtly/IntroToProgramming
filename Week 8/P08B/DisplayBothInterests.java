/* Practical P08B- Question 6
Eryk Gloginski
25/11/2020
Program to input a sum of money to calculate and display balance for 30 years.*/

import java.util.Scanner;

public class DisplayBothInterests
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int years = 30;
   double amount, earned1, earned2;
   double amount1 = 0;
   double amount1rate = 0;
   double amount2 = 0;
   
   System.out.println("Simple interest: 10% of the value of the initial deposit is added each year");
   System.out.println("Compound interest: 5% of the current value added each year.");
   
   // take input
   System.out.println("Enter an amount of money: ");
   amount = input.nextDouble();
   amount1 = amount;
   amount2 = amount1;
   amount1rate = amount1;
   
   amount1rate = amount1 * 0.10;
   // for loop
   for (int count = 1; count <= years; count++)
   {
      // calculate
      amount1 = amount1 + amount1rate;
      amount2 = amount2 + (amount2 * 0.05);
      System.out.println("Plan A: deposit for year " + count + ": " + amount1);
      System.out.println("Plan B: deposit for year " + count + ": " + amount2);
   }
   // get value of investments
   earned1 = amount1 - amount;
   earned2 = amount2 - amount;
   System.out.println("Deposit earned from Plan A: " + earned1);
   System.out.println("Deposit earned from Plan A: " + earned2);
   }
}