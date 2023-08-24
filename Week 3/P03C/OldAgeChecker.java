/* Practical P03C- Question 1
Eryk Gloginski
15/10/2020
Program to tell a person if they qualify for old age pension*/

import java.util.Scanner;

public class OldAgeChecker
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int age, oldAge;
   oldAge = 65;
   
   // prompt for input and take variable
   System.out.println("Enter your age to determine if you're elegible: ");
   age = input.nextInt();
   
   // if else statement to check old age
   if(age >= oldAge)
   {
      System.out.println("Elegible for old age pension. Age: " + age);
   }
   else
   {
      System.out.println("Not elegible for old age pension. Age: " + age);
   }
   
   } // end main method
} // end class
