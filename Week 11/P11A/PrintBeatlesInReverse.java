/* Practical P11A- Question 1
Eryk Gloginski
15/12/2020
Program to print names in reverse order*/

public class PrintBeatlesInReverse
{
   public static void main(String [] args)
   {
   // declare array
   String[] beatles = new String[]{"John", "Paul", "George", "Ringo"};
   
   // for loop
   for(int count = (beatles.length - 1); count >= 0; count--)
   {
      System.out.println(beatles[count]);
   }
   }
}