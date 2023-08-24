/* Practical P04A- Question 3
Eryk Gloginski
20/10/2020
Program to tell the user how much damage happened based on the richter scale value*/

import java.util.Scanner;

public class DetermineEarthquakeDamage
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double richterScaleValue;

   // prompt for input and take variable
   System.out.println("Enter the Richter Scale Value: ");
   richterScaleValue = input.nextInt();
   
   // if else statement
   if(richterScaleValue >= 8)
   {
      System.out.println("Richter Scale Value: " + richterScaleValue);
      System.out.println("Effect: Most buildings are destroyed.");
   }
   else if(richterScaleValue >= 7)
   {  
      System.out.println("Richter Scale Value: " + richterScaleValue);
      System.out.println("Effect: Well-built buildings are damaged.");
   }
   else if(richterScaleValue >= 6)
   {
      System.out.println("Richter Scale Value: " + richterScaleValue);
      System.out.println("Effect: Chimneys tumble, some buildings are destroyed.");
   }
   else if(richterScaleValue >= 5)
   {
      System.out.println("Richter Scale Value: " + richterScaleValue);
      System.out.println("Effect: Walls crack; poorly built buildings are destroyed.");
   }
   else if(richterScaleValue >= 4)
   {
      System.out.println("Richter Scale Value: " + richterScaleValue);
      System.out.println("Effect: Windows shake.");
   }
   else
   {
      System.out.println("Richter Scale Value: " + richterScaleValue);
      System.out.println("Effect: Little.");
   }
   } // end main method
} // end class
