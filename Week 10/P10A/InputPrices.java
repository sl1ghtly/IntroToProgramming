/* Practical P10A- Question 5
Eryk Gloginski
08/12/2020
Program to read and print out total price*/

import java.util.Scanner;

public class InputPrices
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare array and variable
   double[] prices = new double[5];
   double totalPrice = 0;

   // for loop to display marks
   for (int count = 0; count < prices.length; count++)
   {
      System.out.println("Enter the price #" + (count+1));
      prices[count] = input.nextDouble();
   }
   totalPrice = prices[0] + prices[1] + prices[2] + prices[3] + prices[4];
   System.out.println("Total Price: " + totalPrice);
   }
}