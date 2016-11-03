import javax.swing.JOptionPane;

public class Season {
	public enum Months {January, Feburary, March , April, May, June, July, August, September, October, November, December}
	public static void main(String[] args) { 
		Months[] choices = { Months.January, Months.Feburary, Months.March , Months.April, Months.May, Months.June, Months.July, Months.August, Months.September, Months.October, Months.November, Months.December}; 
        Months input = (Months) JOptionPane.showInputDialog(null,"Select the month.", "Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]); 
        while (input!=null) { 
                      //Fill in switch case code below to check for account type and return appropriate Welcome message
        	switch (input) {
        	case December:
        	case January:
        	case Feburary:
        		JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
        		break;
        		
        	case June:
        	case July:
        	case August:
        		JOptionPane.showMessageDialog(null, "Happy Spring days!");
        		break;
        		
         	case September:
        	case October:
        	case November:
        		JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
        		break;
        		
        		default: 
        			JOptionPane.showMessageDialog(null, "No result");
        	
        	}
        	 
        	 input = (Months) JOptionPane.showInputDialog(null,"Select the month.", "Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
                                                                        
      } 
   }
}
