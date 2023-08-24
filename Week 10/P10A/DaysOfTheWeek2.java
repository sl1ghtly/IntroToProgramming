/* Practical P10A- Question 8
Eryk Gloginski
08/12/2020
Program to store names of the days of the week and print check if they are a weekday*/

import java.util.Scanner;

public class DaysOfTheWeek2
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare array and variable
   String[] dayNames = new String[7];
   
   // daily temperatures
   System.out.println("Enter the days of the week: ");
   for(int count = 0; count < dayNames.length; count++)
   {
      System.out.println("Day " + (count + 1) +": ");
      dayNames[count] = input.nextLine();
      switch (count)
      {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
            dayNames[count] = dayNames[count] + " - Weekday";
            break;
         case 5:
         case 6:
            dayNames[count] = dayNames[count] + " - Weekend";
            break;
      }
   }
   System.out.println();
   System.out.println("Printed in order: ");
   for(int count2 = 0; count2 < dayNames.length; count2++)
   {
      System.out.println(dayNames[count2]);
   }
   }
}