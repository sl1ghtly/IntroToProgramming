/* Practical P10A- Question 7
Eryk Gloginski
08/12/2020
Program to store names of the days of the week and print them in reverse order*/

import java.util.Scanner;

public class DaysOfTheWeek1
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
   }
   System.out.println();
   System.out.println("Printed in order: ");
   for(int count2 = 0; count2 < dayNames.length; count2++)
   {
      System.out.println(dayNames[count2]);
   }
   System.out.println();
   System.out.println("Printed in reverse: ");
   for(int count3 = (dayNames.length - 1); count3 > 0; count3--)
   {
      System.out.println(dayNames[count3]);
   }
   }
}