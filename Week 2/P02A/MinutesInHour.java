/* Practical P02A- Question 4
Eryk Gloginski
06/10/2020
Program to calculate minutes in hours*/

import java.util.Scanner;

public class MinutesInHour
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      int hours, minutes, answer;
      
      // take input to variable
      System.out.println("Enter number of hours: ");
      hours = input.nextInt();
      minutes = 60;
      
      // calculate input and display
      answer = hours * minutes;
      System.out.println("Your age in days is " + answer);
      
      }
   
}
