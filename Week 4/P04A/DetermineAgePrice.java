/* Practical P04A- Question 2
Eryk Gloginski
20/10/2020
Program to tell the user how much they need to pay for a ticked based on their age*/

import java.util.Scanner;

public class DetermineAgePrice
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int age;
   double price;

   // prompt for input and take variable
   System.out.println("Enter your age: ");
   age = input.nextInt();
   
   // if else statement
   if(age >= 65)
   {
      price = 4.5;
      System.out.println("Age: " + age + " |  Price: " + price);
   }
   else if(age >= 18)
   {  
      price = 6.0;
      System.out.println("Age: " + age + " |  Price: " + price);
   }
   else if(age <= 17 && age >= 12)
   {
      price = 5.0;
      System.out.println("Age: " + age + " |  Price: " + price);
   }
   else
   {
      System.out.println("Age: " + age + " |  Price: FREE");
   }
   } // end main method
} // end class
