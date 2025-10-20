import java.util.Scanner;
import java.util.ArrayList;

/**
 * Demonstrates the NumberOperations class.
 *
 * Activity 5
 * @author Michael Mann - CPSC - 1210
 * @version 09/17/2025
 */
public class NumberOpsDriver {

   /**
    * Reads a set of positive numbers from the user until the user enters 0.
	 * Prints odds under and powers of 2 under for each number.
	 *
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) {
   	
      Scanner in = new Scanner(System.in);
      
      // declare and instantiate ArrayList with generic type <NumberOperations>
      ArrayList<NumberOperations> numOpsList 
            = new ArrayList<NumberOperations>();
      
      // prompt user for set of numbers
      System.out.println("Enter a list of positive integers separated "
                        + "with a space followed by 0:");
   
      // get first user input using in.nextInt()
      int input = in.nextInt();
   
      // add a while loop as described below:
      while (input != 0) {  // while the input is not equal to 0 
         // add a new NumberOperations object to numOpsList based on user input
         numOpsList.add(new NumberOperations(input)); 
         // get the next user input using in.nextInt()
         input = in.nextInt();   
      }  
      
      int index = 0;
      while (index < numOpsList.size()) {
         NumberOperations num = numOpsList.get(index);
         // add print statement for get num 
         System.out.println("For: " + num.getValue());
      	// add print statement for odds under num
         System.out.println("\tOdds under:\t" + num.oddsUnder());
      	// add print statement for powers of 2 under num
         System.out.println("\tPowers of 2 under:\t" + num.powersTwoUnder());   
         index++;
      }
   }
}