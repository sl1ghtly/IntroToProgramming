/* Practical P05A- Question 5
Eryk Gloginski
03/11/2020
Program to check vowels and display a message if it is a vowel*/

import java.util.Scanner;

public class CheckWire
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   char wire;
   
   // prompt for input and take variable
   System.out.println("Enter a wire letter(E, N or L): ");
   wire = input.next().charAt(0);
   
   // switch statement
   switch(wire)
   {
      case 'E': case 'e':
         System.out.println("EARTH - GREEN");
         break;
      case 'N': case 'n':
         System.out.println("NEUTRAL - BLUE");
         break;
      case 'L': case 'l':
         System.out.println("LIVE - BROWN");
         break;
      default: System.out.print("INVALID Entry - Enter E, N or L ");
   }
   }
}