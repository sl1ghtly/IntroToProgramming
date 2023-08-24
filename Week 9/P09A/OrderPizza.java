/* Practical P09A- Question 5
Eryk Gloginski
01/12/2020
Program to order pizza until exit button is pressed.*/

import java.util.Scanner;

public class OrderPizza
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
   
   System.out.println("Margherita Ordered: " + margheritaCount);
   System.out.println("Hawaiian Ordered: " + hawaiianCount);
   System.out.println("Vegetarian Ordered: " + vegetarianCount);
   }
}