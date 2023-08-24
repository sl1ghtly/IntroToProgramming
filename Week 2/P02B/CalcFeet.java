/* Practical P02B- Question 5
Eryk Gloginski
06/10/2020
Program to input height in inches and receive output in feet*/

import java.util.Scanner;

public class CalcFeet
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      int inches, feet, answer, reminder;
      
      // take input to variables
      System.out.println("Enter height in inches: ");
      inches = input.nextInt();
      
      // calculate input and display
      feet = inches / 12;
      reminder = inches % 12;
      System.out.println("Your height in feet is " + feet + " + " + reminder + " inches");
      
      }
   
}
