import java.util.ArrayList;

/**
 * Tempertaures.java.
 * Holds a set of integer values representing daily temps
 *
 * Activity 6
 * @author Michael Man - CPSC - 1210
 * @version 09/24/2025
 */
public class Temperatures {
   //Instance variables
   private ArrayList<Integer> temperatures;
   
   
   
   /**
    * Creates Temperatures object.
    * @param temperaturesIn ArrayList of Temperature objects
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   } 
   
   /**
    * Returns the lowest Temperature.
    * @return lowest temperature in list
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 1; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      } 
      return low;
   }
   
   /**
    * Returns highest temperature.
    * @return highest temperature from the list
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }      
      return high;
   }
  
   /**
    * Takes in an integer, compares with lowest temp.
    * returns lowest temp
    * @param lowIn Integer of lowest minimum temp
    * @return lowest temperature
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
    * Takes in an integer, compares with highest temp.
    * returns highest temp
    * @param highIn Integer highest maximum temp
    * @return highest temperature
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
    * Returns a summary of the list of Temperatures.
    * and highest/lowest temps
    * @return temperature list info
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
           + "\n\tLow: " + getLowTemp()
           + "\n\tHigh: " + getHighTemp();
   }
 
}