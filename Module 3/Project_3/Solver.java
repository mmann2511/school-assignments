import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Program that calculates equation.
 * and uses Decimal formatting to round result
 * 
 * Project 3 - A
 * @author Michael Mann - CPSC -1210
 * @version 09/04/2025
 */ 

public class Solver {
   
   /**
    * Receives value for x and calculates equation.
    * Equation: 
    * Square root of (11x^4 + 9x^3 + 7x^2 + 5x + 4)
    * Divided by (2x + 4)
    * Converts to string to index length to the right and left of decimal
    * Lastly formats result into rounded number
    * @param args Command line arguments - not used.
    */


   public static void main(String [] args) {
   
      double x;
      double radicand;
      double sqrtrad;
      double denominator;
      double quotient;
      DecimalFormat df = new DecimalFormat("#,##0.0####"); 
    
      
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
     
      // Compute Radicand
      radicand = (11 * Math.pow(x, 4) + 9 * Math.pow(x, 3) 
                  + 7 * Math.pow(x, 2) + (5 * x) + 4);
      
      // Square root of Radicand
      sqrtrad = Math.sqrt(radicand);
      
      // Calculate Denominator
      denominator = (2 * x + 4);
      
      // Calculate Quotient
      quotient = (sqrtrad / denominator);
      
      // Convert to String
      String s = Double.toString(quotient);
      
      // Find Decimal
      int decimalLoc = s.indexOf(".");
      
      // Count characters
      int charLeft = decimalLoc;
      int charRight = s.length() - decimalLoc - 1;
      
      
      System.out.println("Result: " + quotient);
      System.out.println("# of characters to left of decimal point: " 
         + charLeft);
      System.out.println("# of characters to right of decimal point: "
         + charRight);
      System.out.println("Formatted Result: " + df.format(quotient));
      
      
      
      
            
   
   
   
   }


}