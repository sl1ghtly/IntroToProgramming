/* Practical P11C- Question 6
Eryk Gloginski
18/12/2020
Program to display numbers of days per month until -1 is entered*/

import java.util.Scanner;

public class Continents
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare array + vars
   int[] population = {1216000000, 2500, 1463000000, 42927179, 741400000, 179000000, 122500000};
   String[] continents = {"Africa", "Antarctica", "Asia", "Oceania", "Europe", "NAmerica", "SAmerica"};
   int continentNum = 0;
   
   do {
      System.out.println("Enter month number [1 to 7]: [enter -1 to stop]: ");
      continentNum = input.nextInt();
      
      if (continentNum != -1)
      {
         System.out.println(continents[continentNum - 1] + " has a population of " + population[continentNum -1] + " people.");
      }
   }while (continentNum != -1);
   System.out.println("Goodbye. ");
   }
}