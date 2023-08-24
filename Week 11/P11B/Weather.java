/* Practical P11B- Question 4
Eryk Gloginski
16/12/2020
Program to display height taller and smaller*/

import java.util.Scanner;

public class Weather
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare array + vars
   int[] temps = {8, -1, -4, -2, 1, -1, 4};
   String[] dayNames = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
   int tempNum = 0;
   
   for (int i = 0; i < temps.length; i++)
   {  
      tempNum = temps[i];
      if (tempNum > 0)
      {
         System.out.println(dayNames[i] + "\t\t" + temps[i]);
      }
      else
      {
         System.out.println(dayNames[i] + "\t\t" + temps[i] + "\t\t FREEZING");
      }
   }
   
   }
}