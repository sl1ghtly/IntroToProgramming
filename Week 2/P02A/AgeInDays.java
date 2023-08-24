/* Practical P02A- Question 2
Eryk Gloginski
06/10/2020
Program to give the user's age in days*/

import java.util.Scanner;

public class AgeInDays
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      int years, daysInAYear, answer;
      
      // take input to variable
      System.out.println("Enter your age: ");
      years = input.nextInt();
      daysInAYear = 365;
      
      // calculate input and display
      answer = years * daysInAYear;
      System.out.println("Your age in days is " + answer);
      
      }
   
}
