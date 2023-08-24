/* Practical P11Q- Question 2
Eryk Gloginski
18/12/2020
Program to tell the user how much they need to pay for a ticket based on their age*/

import java.util.Scanner;

public class AgePrice
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int amount;
   int age;
   double price = 0;
   double totalPrice = 0;

   // prompt for input and take variable
   System.out.println("Enter amount of people: ");
   amount = input.nextInt();
   
   do
   {
      System.out.println("Enter age: ");
      age = input.nextInt();
      
      if (age >= 18)
      {  
         price = 10;
      }
      else
      {
         price = 5;
      }
      
      totalPrice = totalPrice + price;
      amount--;
   }while (amount != 0);
   
   System.out.println("Total Price: " + totalPrice);
   }
} 
