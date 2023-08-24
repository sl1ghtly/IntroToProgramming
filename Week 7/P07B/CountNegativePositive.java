/* Practical P07B- Question 4
Eryk Gloginski
17/11/2020
Program to terminate when user puts inputs 0 but counts amount of negative and positive numbers.*/

import java.util.Scanner;

public class CountNegativePositive
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int num;
   int positive = 0;
   int negative = 0;
   
   System.out.println("Enter a positive or negative number. Enter 0 to end.");
   num = input.nextInt();
   
   while (num != 0)
   {
      if (num > 0)
      {
         positive++;
      }
      else if (num < 0)
      {
         negative++;
      }
      System.out.println("Enter 0 to end.");
      num = input.nextInt();
   }
   System.out.println("Well done, you entered 0!");
   System.out.println("You entered " + positive + " positive numbers and " + negative + " negative numbers.");
   }
}