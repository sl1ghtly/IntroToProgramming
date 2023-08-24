/* Practical P11B- Question 2
Eryk Gloginski
16/12/2020
Program to display height taller and smaller*/

import java.util.Scanner;

public class Height
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare array + vars
   double[] height = {1.65, 1.70, 1.75, 1.80, 1.85};
   String[] names = {"Name1", "Name2", "Name3", "Name4", "Name5"};
   double heightNum = 0;
   int taller = 0;
   int smaller = 0;
   
   System.out.println("Enter your height: ");
   heightNum = input.nextDouble();
   
   for (int i = 0; i < height.length; i++)
   {   
      if (heightNum > height[i])
      {
         taller++;
      }
      else if (heightNum < height[i])
      {
         smaller++;
      }
   }
   
   System.out.println("You are taller than: " + taller + " people");
   System.out.println("You are smaller than: " + smaller + " people");
   }
}