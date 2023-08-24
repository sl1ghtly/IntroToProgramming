/* Practical P08B- Question 4
Eryk Gloginski
25/11/2020
Program to take in daily temperature and display it as average for the week.*/

import java.util.Scanner;

public class AvgTempWeek
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int average = 0;
   int temperature = 0;
   int total = 0;
   
   // for loop
   for (int count = 1; count <=7; count++)
   {
      System.out.println("Enter temperature for day " + count + ".");
      temperature = input.nextInt();
      total = total + temperature;
   }
   average = total / 7;
   System.out.println("Averate temperature of the week: " + average + " Celcius.");
   }
}