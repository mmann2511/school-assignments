import java.util.Scanner;

/**
 * Program that provides calculations, based on a someone's personal info. 
 *
 * Activity 2
 * @author Michael Mann - CPSC - 1210
 * @version 08/24/2025 
 */

public class AgeStatistics {

   /**
    * Asks for name, age, and gender.
    * Calculates age into minutes and centuries
    * Calculates age and gender into max heart rate
    * @param args Command line arguments - not used.
    */
      

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //convert age
      System.out.println("\tYour age in minutes is "
            + ageInYears * 525600 + " minutes. ");
            
      System.out.println("\tYour age in centuries is "
            + (double) ageInYears / 100 + " centuries. ");
            
      //display max heart rate
      System.out.print("Your max heart rate is ");
      if (gender == 1) { //calculate female MHR
         maxHeartRate = 209 - 0.7 * ageInYears;
      
      }
      
      else { //calculate male HR
         maxHeartRate = 214 - 0.8 * ageInYears;
      
      }
      System.out.println(maxHeartRate + " beats per minute.");      
                   
   
   }


}