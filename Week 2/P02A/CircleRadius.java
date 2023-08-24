/* Practical P02A- Question 3
Eryk Gloginski
06/10/2020
Program to calculate circle radius*/

import java.util.Scanner;

public class CircleRadius
{

   public static void main(String [] args)
   
      {
      
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double num1, answer;
      final double pi = 3.141592;
      
      // take input to variable
      System.out.println("Enter radius to calculate: ");
      num1 = input.nextDouble();
      
      // calculate input and display
      answer = pi * num1 * num1;
      System.out.println("The area of the circle is: " + answer);
      
      }
   
}
