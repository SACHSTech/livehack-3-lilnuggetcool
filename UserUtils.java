class Problem1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() { 
    public static String createUserName(String firstName, String lastName, String studentNumber) {
      if (firstName == null || lastName == null || studentNumber == null ||
          firstName.isEmpty() || lastName.isEmpty() || studentNumber.isEmpty()) {
          throw new IllegalArgumentException("Input strings cannot be null or empty.");
      }
  
      if (studentNumber.length() != 9 || !studentNumber.matches("\\d+")) {
          throw new IllegalArgumentException("Student number must be a 9-digit number.");
      }
  
      char firstInitial = Character.toUpperCase(firstName.charAt(0));
      String lastNameInitials = lastName.substring(0, Math.min(4, lastName.length())).toLowerCase();
      String studentNumDigits = studentNumber.substring(Math.max(0, studentNumber.length() - 3));
  
      // Convert char to String for proper concatenation
      String firstInitialStr = String.valueOf(firstInitial);
  
      return firstInitialStr + lastNameInitials + studentNumDigits;
  }    
    
    
  }
} 
/**
 * This class provides methods to handle user-related operations.
 */
public class UserUtils {

  /**
   * Creates a username using the specified rules.
   *
   * @param firstName     The first name of the student.
   * @param lastName      The last name of the student.
   * @param studentNumber The student number (9 digits) as a string.
   * @return The generated username.
   */
  public static String createUserName(String firstName, String lastName, String studentNumber) {
      // Generate username based on the first name, last name, and student number
      String username = firstName.substring(0, 1) + lastName.substring(0, 1) + studentNumber.substring(0, 3);
      return username.toLowerCase(); // Convert username to lowercase
  }

  /**
   * Validates a password based on specified conditions.
   *
   * @param password The password to validate.
   * @return True if the password meets the conditions, false otherwise.
   */
  public static boolean validatePassword(String password) {
      // Check if password is at least 7 characters long
      if (password.length() < 7) {
          return false;
      }

      // Check if password consists of only letters or digits
      if (!password.matches("[a-zA-Z0-9]+")) {
          return false;
      }

      // Check if password has at least one uppercase letter
      boolean hasUppercase = false;
      for (char c : password.toCharArray()) {
          if (Character.isUpperCase(c)) {
              hasUppercase = true;
              break;
          }
      }

      return hasUppercase;
  }

  // You can add more methods here for additional user operations
}
