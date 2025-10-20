import java.util.Scanner;
import java.util.ArrayList;

/**
 * TemperatureInfo.java.
 * Allows users to input temperatures 
 * and interact witht eh Temperature Class
 * 
 * Activity 6
 * @author Michael Mann - CPSC - 1210
 * @version 09/24/2025
 */

public class TemperatureInfo {

   /**
    * Collects temperature input from user.
    * Prompts user to enter a letter depending on 
    * what action user wants completed.
    * Shows low and high temperatures
    * Summary of temperatures that user input
    * @param args Command line arguments (not used)
    */
   public static void main(String[] args) {
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      Scanner userInput = new Scanner(System.in);
      
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      Temperatures temps = new Temperatures(tempsList); 
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp,"
            + " [H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L': 
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         }    
      } while (choice != 'E');
   
   }


}