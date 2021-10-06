
/*
   Name: Etu Das

  
   Description:
   
   This program is designed to create a final report that shows the total customers, total customer eligible for discount,
   and the average discount cost. A customer can enter their name, length of policy, yearly premium amount, and
   check if they are eligible for a discount. 
   
   The customer is required to input all the mandatory data required to calculate 
   the average discount amount. 
   
   
   After the customer input all the valid information, the program will ask the user if they want to continue. There, the customer,
   has the choice to end the program or continue inputing data. At the end of the program, it will print out a report.
   
  */
import javax.swing.JOptionPane;
public class ProgEtu4 {
   public static void main (String[] args) {
      final double excellentRate = .15;
      final double aboveavgRate = .10;
      final double avgRate = 0.05;
      double avgDiscount = 0;
      double finaldiscAmount = 0;
      int eligCustomer = 0;
      double yearprem = 0;
      int totalCustomer = 0;
      String userInput ="no";
      // intiated my inputs and outputs 
         while (! (userInput.equals ("yes"))){
         ++totalCustomer;
            String custname = JOptionPane.showInputDialog("Please Enter You Name: ");
            int policyleng =  0;
            // here using a try-catch to catch possible errors
            do {
               try      {        
                 policyleng = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the length of policy: "));
                 
              }
               catch (NumberFormatException e) {
                  policyleng = 0;
              }
               if (policyleng <= 0) {
                  JOptionPane.showMessageDialog (null, "Invalid number of policy length!");
               }
             }
             while (policyleng <= 0);
            // they are all inside the while loop
            
             String drivRating = JOptionPane.showInputDialog("Please Enter Your Driver Rating: ");
             
               while (!(drivRating.equals("Excellent") || drivRating.equals("Above Average") || drivRating.equals("Average") || drivRating.equals("Below Average"))){
             drivRating = (JOptionPane.showInputDialog(" Please put the right rating: "));
             }
             // set all the options that customer can put for drivRating (case sensitive)
             yearprem = Double.parseDouble(JOptionPane.showInputDialog("Please Enter Yearly Premium Amount: "));
               while ( yearprem < 0) {
                  yearprem = Double.parseDouble(JOptionPane.showInputDialog("WRONG! Please Enter Yearly Premium Amount: "));
               // can't put a negative number or less than 0 for yearprem
                                            
              
                }
                // using a case-break to set all the formulas for each rating
                if (policyleng > 3 && ! (drivRating.equals ( "Below Average"))){
                  JOptionPane.showMessageDialog (null, "You are eligible for a discount!");
                  eligCustomer = eligCustomer + 1;
                switch (drivRating) {
                    case "Excellent":
                     finaldiscAmount = yearprem * excellentRate;
                    break ;
                    case "Above Average":
                     finaldiscAmount = yearprem * aboveavgRate;
                    break;
                    case "Average":
                     finaldiscAmount = yearprem * avgRate;
                    break;
                    case "Below Average": 
                    finaldiscAmount = 0;
                    break;
                }}
                // printing the report that includes the average discount, eligble customer, and total customer
                JOptionPane.showMessageDialog (null, "Your discount is: "+ finaldiscAmount);
                        avgDiscount += finaldiscAmount;
                
               userInput = JOptionPane.showInputDialog("Do you want to end?!"); 
               // asking the user if they want to continue or end the program

   
                
             
            
              
         
             
                
                        


                }
                avgDiscount = avgDiscount / eligCustomer;
                JOptionPane.showMessageDialog(null,"**PRINT REPORT**\nTotal Customer: "+ (totalCustomer) + "\nTotal Customer eligble for discount: " + (eligCustomer) + "\nYour Average Discount is: "+ String.format ("$%.2f", avgDiscount)); 

               }
               }
                
          
              
                
             
            
              
             
             