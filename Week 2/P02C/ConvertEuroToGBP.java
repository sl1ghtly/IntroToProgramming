/* Practical P02C- Question 1
Eryk Gloginski
08/10/2020
Program to convert euro into gbp*/

import java.util.Scanner;

public class ConvertEuroToGBP
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double euro, answer;
      double gbp = 0.90;
      
      // take input to variables
      System.out.println("Amount of money in Euro: ");
      euro = input.nextDouble();

      
      // calculate input and display
      answer = gbp * euro;
      System.out.println("This amount of " + euro + " Euro is worth " + answer + " in GBP");
      
      }
   
}
