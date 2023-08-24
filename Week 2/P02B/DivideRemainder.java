/* Practical P02B- Question 7
Eryk Gloginski
08/10/2020
Program to read 2 numbers and display result of dividing*/

import java.util.Scanner;

public class DivideRemainder
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      int num1, num2, remainder, answer;
      
      // take input to variables
      System.out.println("Declare the first number: ");
      num1 = input.nextInt();
      System.out.println("Declare the second number: ");
      num2 = input.nextInt();

      
      // calculate input and display
      answer = num1 / num2;
      remainder = num1 % num2;
      System.out.println(num1 + " divided by " + num2 + " equals " + answer + " remainder " + remainder);
      
      }
   
}
