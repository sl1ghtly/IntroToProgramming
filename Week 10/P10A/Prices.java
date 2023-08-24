/* Practical P10A- Question 3
Eryk Gloginski
08/12/2020
Program to print out prices*/

public class Prices
{
   public static void main(String [] args)
   {
   // declare array and variable
   double[] prices = {12.99, 15.00, 9.50, 130.00, 2.99};
   
   // for loop to display marks
   for (int count = 0; count < prices.length; count++)
   {
      System.out.print(prices[count] + ", ");
   }
   }
}