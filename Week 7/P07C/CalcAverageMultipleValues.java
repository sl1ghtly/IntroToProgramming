/* Practical P07C- Question 1
Eryk Gloginski
20/11/2020
Program to terminate when you enter -1 and calculate average of x amount of numbers.*/

import java.util.Scanner;

public class CalcAverageMultipleValues
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int num;
   int numAmount = 0;
   int average = 0;
   
   do
   {
      System.out.println("Enter a Number: ");
      num = input.nextInt();
      average = average + num;
      numAmount++;
      
   } while (num != -1);
   numAmount--;
   average = (average + 1) / numAmount;
   System.out.println("Average of " + numAmount + " numbers: " + average);
   }
}