/* Practical P02A- Question 1
Eryk Gloginski
06/10/2020
Program to take input and add it together*/

import java.util.Scanner;

public class AddTwoDoubleValues
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double num1, num2, answer;
      
      // take input to variables
      System.out.println("Declare the first double number: ");
      num1 = input.nextDouble();
      System.out.println("Declare the second double number: ");
      num2 = input.nextDouble();
      
      // calculate input and display
      answer = num1 + num2;
      System.out.println("The answer is: " + answer);
      
      }
   
}
