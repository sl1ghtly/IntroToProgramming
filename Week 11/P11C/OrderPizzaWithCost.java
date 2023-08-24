/* Practical P11C- Question 5
Eryk Gloginski
18/12/2020
Program to order pizza until exit button is pressed and calculate total cost of the order.*/

import java.util.Scanner;

public class OrderPizzaWithCost
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int margheritaCount = 0;
   int hawaiianCount = 0;
   int vegetarianCount = 0;
   char pizzaType = ' ';
   double margheritaPrice = 10;
   double hawaiianPrice = 12;
   double vegetarianPrice = 9.5;
   double margheritaTotalPrice, hawaiianTotalPrice, vegetarianTotalPrice;
   double totalPrice = 0;
   
   // for loop
   do
   {
      System.out.println("Enter a pizza (M for Margherita, H for Hawaiian, V for Vegetarian) ");
      pizzaType = input.next().charAt(0);
      switch (pizzaType)
      {
         case 'M':
         case 'm':
            margheritaCount++;
            break;
         case 'H':
         case 'h':
            hawaiianCount++;
            break;
         case 'V':
         case 'v':
            vegetarianCount++;
            break;
      }
         
   }while (pizzaType != 'q');
   // calculate price
   margheritaTotalPrice = margheritaPrice * margheritaCount;
   hawaiianTotalPrice = hawaiianPrice * hawaiianPrice;
   vegetarianTotalPrice = vegetarianPrice * vegetarianCount;
   totalPrice = margheritaPrice + hawaiianPrice + vegetarianPrice;
   
   System.out.println("Margherita Ordered: " + margheritaCount);
   System.out.println("Hawaiian Ordered: " + hawaiianCount);
   System.out.println("Vegetarian Ordered: " + vegetarianCount);
   System.out.println("Total Order Price: " + totalPrice);
   }
}