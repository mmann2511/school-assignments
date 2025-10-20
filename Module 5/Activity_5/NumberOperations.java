/**
 * NumberOperations Class contains methods.
 * to perform various operations on an integer
 * that a user provides.
 *
 * Activity 5
 * @author Michael Mann - CPSC - 1210
 * @version 09/17/2025
 */

public class NumberOperations {
   private int number;

   /**
    * Creates a NumberOperations object.
    * @param numberIn user's integer(s)
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   
   }
   
   /**
    * Returns the user's integer value.
    * @return the intger value.
    */
   public int getValue() {
      return number; //placeholder return
   }
   
   /**
    * Returns a string with odd integers less than.
    * user's integer
    *
    * @return a string with odd integers less than.
    * the user integer
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;   
      }
      return output;
   }
   
   /**
    * Returns a string with powers of 2 less than.
    * user's integer
    *
    * @return a string with powers of two less than.
    * the user integer
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      
      while (powers < number) {
         output += powers + "\t"; // concatenate to output
         powers = powers * 2; // get next power of 2
      }   
      return output;
   }
   
   /**
    * Compares the user's integer to another.
    *
    * @param compareNumber the integer to compare.
    * with user's integer
    * @return 1 if store value is greater,
    * -1 if less, 0 if equal
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      } 
   }
   
   /**
    * Returns a string of the user's integer.
    *
    * @return the string of user's integer.
    */
   public String toString() {
      return number + "";
   }
         

}