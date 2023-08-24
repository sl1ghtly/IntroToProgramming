/* Practical P02C- Question 4
Eryk Gloginski
08/10/2020
Program to take input of hours worked in a week and calculate total wage*/

import java.util.Scanner;

public class CalcWage
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double hours, wage;
      double hourlyIncome = 11;
      
      // take input to variables
      System.out.println("How many hours have you worked past this week? ");
      hours = input.nextDouble();

      // calculate input and display
      wage = hours * hourlyIncome;
      System.out.println("You worked " + hours + " hours and earned " + wage + " this week");
            
      }
   
}
