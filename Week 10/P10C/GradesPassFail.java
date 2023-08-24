/* Practical P10C- Question 5
Eryk Gloginski
11/12/2020
Program to store exam marks based on how many subjects they do and then reading amount of*/

import java.util.Scanner;

public class GradesPassFail
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variables
   int amountOfSubjects;
   System.out.println("Enter amount of subjects: ");
   amountOfSubjects = input.nextInt();
   
   // declare array
   int[] subjects = new int[amountOfSubjects];
   
   // for loop get marks
   for(int count = 0; count < subjects.length; count++)
   {
      System.out.println("Enter subject number #" + (count + 1) + ": ");
      subjects[count] = input.nextInt();
   }
   
   for(int count2 = 0; count2 < subjects.length; count2++)
   {
      if (subjects[count2] >= 40)
      {
         System.out.println(subjects[count2] + " - Pass ");
      }
      else
      {
         System.out.println(subjects[count2] + " - Fail ");
      }
   }
   }
}