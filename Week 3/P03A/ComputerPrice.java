/* Practical P03A- Question 5
Eryk Gloginski
13/10/2020
Program to calculate cost of computers and change price if quantity is bigger than x*/

import java.util.Scanner;

public class ComputerPrice
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int quantity;
   double price;
   double totalCost;
   
   // prompt for input and take variable
   System.out.print("Enter quantity of computers: ");
   quantity = input.nextInt();
   
   // if else statement to calculate price
   if(quantity >= 30)
   {
      price = 500;
      totalCost = quantity * price;
      System.out.println("You pay " + totalCost + " for " + quantity + " computers");
   }
   else
   {
      price = 550;
      totalCost = quantity * price;
      System.out.println("You pay " + totalCost + " for " + quantity + " computers");
   }
   
   } // end main method
} // end class
