/* Practical P03A- Question 4
Eryk Gloginski
13/10/2020
Program to calculate price of 3 books and add discount if price bigger than 50.00*/

import java.util.Scanner;

public class DiscountPrice
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double price1, price2, price3, totalPrice, discount, discountPrice;
   
   // prompt for input and take variable
   System.out.print("Enter first book price: ");
   price1 = input.nextDouble();
   System.out.print("Enter second book price: ");
   price2 = input.nextDouble();
   System.out.print("Enter third book price: ");
   price3 = input.nextDouble();
   
   // calculate total price
   totalPrice = price1 + price2 + price3; 
   
   // if else statement if price 
   if(totalPrice >= 50)
   {
      discount = totalPrice * 0.10;
      discountPrice = totalPrice - discount;
      System.out.println("You pay: " + discountPrice + " (10% Discount!)");
   }
   else
   {
      System.out.println("You pay: " + totalPrice);
   }
   
   } // end main method
} // end class
