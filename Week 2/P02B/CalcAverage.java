/* Practical P02B- Question 1
Eryk Gloginski
08/10/2020
Program to add 3 doubles and get their average*/

import java.util.Scanner;

public class CalcAverage
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double num1, num2, num3, answer;
      
      // take input to variables
      System.out.println("Declare the first double number: ");
      num1 = input.nextDouble();
      System.out.println("Declare the second double number: ");
      num2 = input.nextDouble();
      System.out.println("Declare the second third number: ");
      num3 = input.nextDouble();
      
      // calculate input and display
      answer = (num1 + num2 + num3) / 3;
      System.out.println("The average number is: " + answer);
      
      }
   
}
