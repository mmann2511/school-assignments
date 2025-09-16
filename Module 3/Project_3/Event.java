import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * Program that extracts data from a Numerical Code entered by User.
 * 
 * Project 3 - B
 * @author Michael Mann - CPSC - 1210
 * @ versioin 09/04/2025
 */


public class Event {

   /**
    * Recieves numerical code + characters from User.
    * Extracts information from code using "substring"
    * Formats information to display to user cleanly
    * Provides random number generator
    * @param args Command line arguments - not used.
    */

   public static void main(String [] args) {
   
      Scanner userInput = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("$##0.00");
      DecimalFormat df1 = new DecimalFormat("0%");
      String eventCode;
      
      
      
      System.out.print("Enter your event code: ");
      eventCode = userInput.nextLine();
      
      if (eventCode.length() < 26) {
      
         System.out.println("\nInvalid Event Code.");
         System.out.println("Event code must have at least 26 characters.");
      
      }
      else {
      
      // Trim Event Code
         eventCode = eventCode.trim();
      
      // Extract Event Name
         String eventName = eventCode.substring(25);
      
      //Extract Date (Day/Month/Year)
         String day = eventCode.substring(0, 2); //From 0 to 1
         String month = eventCode.substring(2, 4); //From 2 to 3
         String year = eventCode.substring(4, 8); //From 4 to 7
         String eventDate = (day + "/" + month + "/" + year);
      
      //Extract Time (24hr clock)(Hour + Minutes)
         String hour = eventCode.substring(8, 10); // From 8 to 9
         String minute = eventCode.substring(10, 12); // From 10 to 11
         String eventTime = (hour + ":" + minute);
      
      // Extract Section, Row, Seat
         String eventSection = eventCode.substring(19, 21); // From 19 to 20
         String eventRow = eventCode.substring(21, 23); // Fromt 21 to 22
         String eventSeat = eventCode.substring(23, 25); // From 23 to 24
      
      // Extract Price
         String price = eventCode.substring(12, 17); // From 12 to 16
         double eventPrice = Double.parseDouble(price) / 100.0; 
      
      // Extract Discount
         String discount = eventCode.substring(17, 19); // From 17 to 18
         double eventDiscount = Double.parseDouble(discount) / 100.0;
      
      // Extract Cost
         double eventCost = eventPrice * (1 - eventDiscount);
      
      // Produce Random Number
         Random generator = new Random();
         int prizeNum = generator.nextInt(9998) + 1;
      
      
      
      
      
         System.out.print("\nEvent: " + eventName);
         System.out.print("   Date: " + eventDate);
         System.out.println("   Time: " + eventTime);
         System.out.print("Section: " + eventSection);
         System.out.print("   Row: " + eventRow);
         System.out.println("   Seat: " + eventSeat);
         System.out.print("Price: " + df.format(eventPrice));
         System.out.print("   Discount: " + df1.format(eventDiscount));
         System.out.println("   Cost: " + df.format(eventCost));
         System.out.println("Prize Number: " + prizeNum);
      
      
      }
      
   
   
   
   }


}