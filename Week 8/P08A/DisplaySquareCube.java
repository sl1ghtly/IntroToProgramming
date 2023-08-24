/* Practical P08A- Question 9
Eryk Gloginski
24/11/2020
Program to enter a number and display it's Square and Cube*/

import java.util.Scanner;

public class DisplaySquareCube
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variables
   int number;
   int squared = 0;
   int cubed = 0;
   
   System.out.println("Enter a number: ");
   number = input.nextInt();
   
   System.out.println("Number \t\tSquare \t\tCube");
   // for loop
   for (int count = 1; count <= number; count++)
   {
      squared = count * count;
      cubed = count * count * count;
      System.out.println(count + "\t\t\t\t" + squared + "\t\t\t\t" + cubed); 
   }
   }
}