/* Practical P08C- Question 2
Eryk Gloginski
27/11/2020
Program to take in amount of people, check if it's an Adult or Child and calculate costs.*/

import java.util.Scanner;

public class CinemaTicketSystem
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int houses;
   char age = ' ';
   double price = 0;
   double total = 0;
   
   System.out.println("How many in your group? ");
   houses = input.nextInt();
   
   // for loop
   for (int count = 1; count <= houses; count++)
   {
      System.out.println("Is person " + count + " an adult or a child [A or C].");
      age = input.next().charAt(0);
      switch (age)
      {
         case 'A':
         case 'a':
            price = 8.50;
            break;
         case 'C':
         case 'c':
            price = 5.50;
            break;
         default:
            System.out.println("Invalid. Type [A or C].");
            price = 0;
            break;
      }
      total = total + price;
   }
   System.out.println("Total price of tickets: " + total + ".");
   }
}