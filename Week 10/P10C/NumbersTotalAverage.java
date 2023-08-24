/* Practical P10C- Question 3
Eryk Gloginski
11/12/2020
PSEUDOCODE PROGRAM*/

/*

GET amountOfNumbers

DECLARE ARRAY SIZE OF amountOfNumbers

FOR i = 0; i < Length of amountOfNumbers; i++;
   GET numbers

FOR i = 0; i < Length of amountOfNumbers; i++;
   total = total + numbers

FOR i3 = 0; i3 < Length of amountOfNumbers; i3++;
   DISPLAY numbers
   
DISPLAY total
DISPLAY average

*/

import java.util.Scanner;

public class NumbersTotalAverage
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variables
   int amountOfNumbers;
   double total = 0;
   double average = 0;
   System.out.println("Enter amount of students: ");
   amountOfNumbers = input.nextInt();
   
   // declare array
   int[] numbers = new int[amountOfNumbers];
   
   // for loop get numbers
   for(int count = 0; count < numbers.length; count++)
   {
      System.out.println("Enter number #" + (count + 1) + ": ");
      numbers[count] = input.nextInt();
   }
   
   // for loop get total
   for(int count2 = 0; count2 < numbers.length; count2++)
   {
      total = total + numbers[count2];
   }
   
   // for loop display numbers
   for(int count3 = 0; count3 < numbers.length; count3++)
   {
      System.out.println("Number #" + (count3 + 1) + ": " + numbers[count3]);
   }
   
   // calculate average
   average = total / numbers.length;
   
   // display total and average
   System.out.println("Total: " + total);
   System.out.println("Average: " + average);
   }
}