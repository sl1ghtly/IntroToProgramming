/* Practical P02B- Question 7
Eryk Gloginski
08/10/2020
Program to add 2 strings together*/

import java.util.Scanner;

public class GiveName
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // take input to variables
      System.out.println("Please enter your first name: ");
      String firstName = input.nextLine();
      System.out.println("Please enter your surname: ");
      String lastName = input.nextLine();

      
      // display
      System.out.println("Your full name is " + firstName + " " + lastName);
      
      }
   
}
