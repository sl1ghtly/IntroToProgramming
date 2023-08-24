/* Practical P03B- Question 2
Eryk Gloginski
14/10/2020
Program to calculate price of 2 games and add
discount 10% discount if price less than 50
and add 20% discount if price above 50*/

import java.util.Scanner;

public class DiscountGame
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double price1, price2, totalPrice, discount, discountPrice;
   
   // prompt for input and take variable
   System.out.println("Enter first game price: ");
   price1 = input.nextDouble();
   System.out.println("Enter second game price: ");
   price2 = input.nextDouble();
   
   // calculate total price
   totalPrice = price1 + price2; 
   
   // if else statement if price 
   if(totalPrice >= 50)
   {
      discount = totalPrice * 0.20;
      discountPrice = totalPrice - discount;
      System.out.println("You pay: " + discountPrice + " (20% Discount!)");
   }
   else
   {
      discount = totalPrice * 0.10;
      discountPrice = totalPrice - discount;
      System.out.println("You pay: " + discountPrice + " (10% Discount!)");
   }
   
   } // end main method
} // end class
