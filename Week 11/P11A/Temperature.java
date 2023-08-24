/* Practical P11A- Question 3
Eryk Gloginski
15/12/2020
Program to print print hottest, coldest and average temperature*/

import java.util.Scanner;

public class Temperature
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // get array size
   System.out.println("Enter days for temperature check: ");
   int size = input.nextInt();
   
   // declare array + vars
   int[] temperatures = new int[size];
   int largest = temperatures[0];
   int smallest = temperatures[0];
   
   // for loop
   for (int count = 0; count < temperatures.length; count++)
   {
      System.out.println("Enter temperature #" + (count + 1) +": ");
      temperatures[count] = input.nextInt();
   }
   
   for (int count2 = 0; count2 < temperatures.length; count2++)
   {
      if (temperatures[count2] > largest)
      {
         largest = temperatures[count2];
      }
   }
   
   for (int count3 = 0; count3 < temperatures.length; count3++)
   {
      if (temperatures[count3] < smallest)
      {
         smallest = temperatures[count3];
      }
   }
   
   System.out.println("Largest: " + largest);
   System.out.println("Smallest: " + smallest);
   }
}