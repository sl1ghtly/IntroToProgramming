/* Practical P09B- Question 1
Eryk Gloginski
02/12/2020
PSEUDOCODE PROGRAM.*/

import java.util.Scanner;

public class GroupPriceAdd
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int groupAmount;
   int age = 0;
   double price = 0;
   
   System.out.println("Enter amount of people in the group: ");
   groupAmount = input.nextInt();
   
   // do while loop
   do
   {
      System.out.println("Enter your age person " + ": ");
      age = input.nextInt();
      if (age > 18)
      {
         price = price + 10;
      }
      else if (age < 18)
      {
         price = price + 5;
      }
      groupAmount--;
   }while (groupAmount != 0);
   
   System.out.println("Total Price: " + price);
   }
}