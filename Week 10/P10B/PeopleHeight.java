/* Practical P10B- Question 4
Eryk Gloginski
09/12/2020
Program to enter amount of people in a room, get their heights and in meters and print them out.*/

import java.util.Scanner;

public class PeopleHeight
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare vars
   int amountOfPeople;
   System.out.println("Enter amount of people: ");
   amountOfPeople = input.nextInt();
   
   // declare array
   double[] heights = new double[amountOfPeople];
   
   // for loop
   for(int count = 0; count < heights.length; count++)
   {
      System.out.println("Enter your height person #" + (count + 1) + ": ");
      heights[count] = input.nextDouble();
   }
   for(int count2 = 0; count2 < heights.length; count2++)
   {
      System.out.println("Person #" + (count2 + 1) +": " + heights[count2] + "meters. ");
   }
   
   }
}