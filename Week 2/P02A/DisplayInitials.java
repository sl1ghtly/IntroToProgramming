/* Practical P02A- Question 6
Eryk Gloginski
06/10/2020
Program add initials together and display them*/

import java.util.Scanner;

public class DisplayInitials
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      char initial1, initial2;
      
      // take input to variables
      System.out.println("Enter your first initial: ");
      initial1 = input.next().charAt(0);
      System.out.println("Enter your second initial: ");
      initial2 = input.next().charAt(0);
      
      // display input
      System.out.println("Your initials are " + initial1 + " " + initial2);
      
      }
   
}
