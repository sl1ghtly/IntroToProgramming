/* Practical P03C- Question 4
Eryk Gloginski
15/10/2020
Program to tell if the user hit the credit limit and apply appropirate discount*/

import java.util.Scanner;

public class CreditLimit
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double creditLimit, purchasesToDate, totalCredit, todayPurchase, discount, limitExceeded, discountPrice, price;
   discount = 0;
   
   // prompt for input and take variable
   System.out.println("Enter your credit limit: ");
   creditLimit = input.nextDouble();
   System.out.println("Enter your purchases to date: ");
   purchasesToDate = input.nextDouble();
   System.out.println("Enter today's purchases: ");
   todayPurchase = input.nextDouble();
   
   limitExceeded = purchasesToDate + todayPurchase;
   
   // if else statement to see if num1 is a multiple of num2
   if(limitExceeded >= creditLimit)
   {
      discount = 0.10;
      discountPrice = todayPurchase * discount;
      price = todayPurchase - discountPrice;
      System.out.println("Credit limit has been reached (15% Discount!)");
      System.out.println("You pay: " + price);
   }
   else
   {
      discount = 0.15;
      discountPrice = todayPurchase * discount;
      price = todayPurchase - discountPrice;
      System.out.println("Purchase within credit limit (10% Discount!)");
      System.out.println("You pay " + price);
   }
   
   } // end main method
} // end class
