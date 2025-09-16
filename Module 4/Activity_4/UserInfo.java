/**
 * UserInfo.java.
 * Class that builds instances of Users 
 * Contains methods to set user info
 * and display user info
 *
 * Activity 4
 * @author Michael Mann - CPSC - 1210
 * @version 08/09/2025
 */

public class UserInfo {
   // Fields - instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   // Fields - Constants
   private static final int OFFLINE = 0, ONLINE = 1;
  
  
   
  /**
   * Creates a new UserInfo object.
   * @param firstNameIn user's first name
   * @param lastNameIn user;s last name
   */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
    
    
   }
   
  /**
   * Returns a string representing the User Object. 
   * @return a string containing user details
   */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
            
      return output; 
   }   
   
 /**
  * Sets location of the user.
  * @param locationIn the location to set
  */ 
   public void setLocation(String locationIn) {
      location = locationIn;
      
   }
   
  /**
   * Returns the Location of the user.
   * @return user's location.
   */
   public String getLocation() {
      return location;
    
   }
   
   /**
    * Sets the user's age.
    * @param ageIn the age to set
    * @return true if age was succesfully set; false otherwise
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      
      }
      return isSet;
   }   
      
  /**
   * Returns the age of the user.
   * @return user's age.
   */
   public int getAge() {
      return age;
   }    
   
   
  /**
   * Logs the user off by setting status.
   */
   public void logOff() {
      status = OFFLINE;
   }
   
  /**
   * Logs user on by setting status.
   */ 
   public void logOn() {
      status = ONLINE;
   }
      
   
   



}