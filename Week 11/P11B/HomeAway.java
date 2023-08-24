/* Practical P11B- Question 5
Eryk Gloginski
16/12/2020
Program to display home wins, away wins and draws*/

import java.util.Scanner;

public class HomeAway
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare array + vars
   int[] home = new int [6];
   int[] away = new int [6];
   int homeScore = 0;
   int awayScore = 0;
   int homeWin = 0;
   int awayWin = 0;
   int draw = 0;
   
   for (int i1 = 0; i1 < home.length; i1++)
   {  
      System.out.println("Enter score for home: #" + (i1 + 1));
      homeScore = input.nextInt();
   }
   
   for (int i2 = 0; i2 < away.length; i2++)
   {  
      System.out.println("Enter score for away: #" + (i2 + 1));
      awayScore = input.nextInt();
   }
   for (int i3 = 0; i3 < away.length; i3++)
   {
      if (home[i3] > away[i3])
      {
         homeWin++;
      }
      else if (home[i3] < away[i3])
      {
         awayWin++;
      }
      else if (home[i3] == away[i3])
      {
         draw++;
      }
   }
   System.out.println("Home Wins: " + homeWin);
   System.out.println("Away Wins: " + awayWin);
   System.out.println("Draws: " + draw);
   }
}