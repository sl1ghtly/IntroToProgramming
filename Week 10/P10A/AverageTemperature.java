/* Practical P10A- Question 6
Eryk Gloginski
08/12/2020
Program to read daily temperature and caculate average*/

import java.util.Scanner;

public class AverageTemperature
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare array and variable
   double[] temps = new double[7];
   double averageTemperature;
   
   // daily temperatures
   System.out.println("Enter the daily temperature: ");
   for(int count = 0; count < temps.length; count++)
   {
      System.out.println("Day " + (count + 1) +": ");
      temps[count] = input.nextDouble();
   }
   averageTemperature = temps[0] + temps[1] + temps[2] + temps[3] + temps[4] + temps[5] + temps[6];
   averageTemperature = averageTemperature / 7;
   System.out.println("Average temperature for the week: " + averageTemperature);
   }
}