/* CA2 Question 2
Eryk Gloginski
BSc Computing
10/12/2020
Program for Christmas Pantomine CA2 Q2*/

import java.util.Scanner;

public class ChristmasPantomine
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variables
   int amount;
   final double adultPrice = 10.00;
   final double teenPrice = 7.50;
   final double childPrice = 5.00;
   int adultCounter = 0;
   int teenCounter = 0;
   int childCounter = 0;
   int totalTickets;
   double totalPrice;
   double discount = 0;
   double totalPriceDiscount = 0;
   
   // ask for input
   System.out.println("Welcome to the LYIT Christmas Pantomine. ");
   System.out.println("How many tickets would you like to buy? ");
   amount = input.nextInt();
   
   // declare array
   int[] age = new int[amount];
   
   // for loop
   for (int count = 0; count <= (age.length - 1); count++)
   {
      System.out.println("Enter age of person #" + (count + 1) + ": ");
      age[count] = input.nextInt();
      
      // adult
      if (age[count] >= 20)
      {
         adultCounter++;
      }
      
      // teen
      else if (age[count] >= 13 && age[count] < 20)
      {
         teenCounter++;
      }
      // child
      else
      {
         childCounter++;
      }
   }
   
   // total amount of tickets + display tickets
   totalTickets = adultCounter + teenCounter + childCounter;
   System.out.println("Total number of tickets: " + totalTickets);
   System.out.println("Adult tickets: " + adultCounter);
   System.out.println("Teenager tickets: " + teenCounter);
   System.out.println("Child tickets: " + childCounter);
   
   // total price
   totalPrice = (adultPrice * adultCounter) + (teenPrice * teenCounter) + (childPrice * childCounter);
   System.out.println("Total price: " + totalPrice);
   
   // apply a discount if required amount of adults/teens or kids are there
   if (adultCounter >= 1 && teenCounter >= 2 || childCounter >= 2)
   {
      discount = 0.15;
      totalPriceDiscount = totalPrice * discount;
      totalPrice = totalPrice - totalPriceDiscount;
      System.out.println("Family Discount: " + totalPriceDiscount);
      System.out.println("Total price less discount: " + totalPrice);
   }
   else
   {
      System.out.println("No Family Discount Available. ");
      System.out.println("Final Price: " + totalPrice);
   }
   }
}