/* Practical P05B- Question 4
Eryk Gloginski
03/11/2020
Program to take 3 temperatures, get the average and display a message if a condition is met.*/

import java.util.Scanner;

public class CheckTempAvg
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   int temp1, temp2, temp3, avg;
   
   // prompt for input and take variable
   System.out.println("Enter first temperature: ");
   temp1 = input.nextInt();
   System.out.println("Enter second temperature: ");
   temp2 = input.nextInt();
   System.out.println("Enter third temperature: ");
   temp3 = input.nextInt();
   
   avg = (temp1 + temp2 + temp3) / 3;
   
   // switch statement
   if(avg < 0)
   {
      System.out.println("FREEZING: " + avg);
   }
   else if (avg > 1 && avg < 9)
   {
      System.out.println("COLD: " + avg);
   }
   else if (avg > 9 && avg < 16)
   {
      System.out.println("MODERATE: " + avg);
   }
   else
   {
      System.out.println("WARM: " + avg);
   }
   }
}