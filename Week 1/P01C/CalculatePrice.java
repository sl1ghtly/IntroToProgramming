/* Practical P01C- Question 5
Eryk Gloginski
30/09/2020
Program to calculate the ticket price*/

public class CalculatePrice
{

   public static void main(String [] args)
   
      {
      //delcare ticket amount and their price
      int ticketAmount = 4;
      double ticketPrice = 7.50;

      
      //calculate price
      double totalPrice = ticketPrice * ticketAmount;
      
      System.out.println("The price for the tickets is: " + totalPrice + " Euro");

      }
   
}