import javax.swing.JOptionPane;

public class CapacityWarning2
{
   public static void main(String[] args)
   {
      // Declare & Initialize variables
      final int MAX_CAPACITY = 65;
      int numPeople = 0;
      int totalNumPeople = 0;
      int currentNumPeople = 0;   
      String report = "";
      // Print report heading
      report += "Capacity Report\n\n";
     
    while (totalNumPeople < MAX_CAPACITY) {
      do {
         try {
            // Prompt for number of people entering or leaving
            numPeople = Integer.parseInt(JOptionPane.showInputDialog("Number of people entering('-' if exiting): "));
         } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a number.");
            numPeople = 999;
         }
      } while (numPeople == 999);
      // Calculate total number of people 
      totalNumPeople += numPeople;
      
      if (totalNumPeople > MAX_CAPACITY) {
      JOptionPane.showMessageDialog(null, "You have been denied entry due to capacity restrictions.");
      } else {
         // Calculate current number of people
         currentNumPeople += numPeople;
         // Display current number of people
         JOptionPane.showMessageDialog(null, "Current number of people: " + currentNumPeople);      
      }
    }
    // Print current number of people
    report += ("Current Number of People: " + currentNumPeople); 
    // Display full report
    JOptionPane.showMessageDialog(null, report);
   
   
   }
}