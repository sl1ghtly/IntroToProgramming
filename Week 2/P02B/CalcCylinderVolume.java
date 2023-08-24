/* Practical P02B- Question 2
Eryk Gloginski
08/10/2020
Program to get the volume of a cylinder*/

import java.util.Scanner;

public class CalcCylinderVolume
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double radius, height, volume;
      final double pi = 3.141592;
      
      // take input to variables
      System.out.println("Enter the Radius: ");
      radius = input.nextDouble();
      System.out.println("Enter the Height: ");
      height = input.nextDouble();
      
      // calculate input and display
      volume = pi * (radius * radius ) * height;
      System.out.println("The volume of your cylinder is: " + volume);
      
      }
   
}
