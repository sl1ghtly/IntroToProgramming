/* Practical P04A- Question 5
Eryk Gloginski
20/10/2020
Program to determine if a person should be interrogated*/

import java.util.Scanner;

public class DetermineSuspect
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   String name;
   int age;
   double height;

   // prompt for input and take variable
   System.out.println("What is your name? ");
   name = input.nextLine();
   System.out.println("How old are you? ");
   age = input.nextInt();
   System.out.println("How tall are you? ");
   height = input.nextDouble();
   
   // if else statement
   if((age >= 20 && age <= 30) && (height >= 1.60 && height <= 1.75))
   {
      System.out.println(name + " is a suspect and should be interrogated.");
   }
   else
   {
      System.out.println(name + " is not a suspect and should be released.");
   }
   } // end main method
} // end class
