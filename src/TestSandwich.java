import javax.swing.JOptionPane;


public class TestSandwich {

	public static void main(String[] args) {
		
		//Instantiating two Sandwich objects
		Sandwich mySandwich = new Sandwich();
		Sandwich yourSandwich = new Sandwich();
		String mainIngred, breadType;
		double price;		
		
		//Setting the values of fields in Sandwich
		mainIngred = JOptionPane.showInputDialog("What do you want for the main ingredient?");
		mySandwich.setMainIngred(mainIngred);
		
		breadType = JOptionPane.showInputDialog("What type of bread do you want?");
		mySandwich.setBreadType(breadType);
		
		price = Double.parseDouble(JOptionPane.showInputDialog("What is the price of the sandwich?"));
		mySandwich.setPrice(price);
		
		//Output the details of Sandwich
		JOptionPane.showMessageDialog(null, "You are getting a "
				+ mySandwich.getMainIngred()
				+ " sandwich on " + mySandwich.getBreadType() + " at " + mySandwich.getPrice());
		
		//Setting the values of fields in Sandwich
		mainIngred = JOptionPane.showInputDialog("What do you want for the main ingredient?");
		yourSandwich.setMainIngred(mainIngred);
		
		breadType = JOptionPane.showInputDialog("What type of bread do you want?");
		yourSandwich.setBreadType(breadType);
		
		price = Double.parseDouble(JOptionPane.showInputDialog("What is the price of the sandwich?"));
		yourSandwich.setPrice(price);
		
		//Output the details of Sandwich
		JOptionPane.showMessageDialog(null, "You are getting a "
				+ yourSandwich.getMainIngred()
				+ " sandwich on " + yourSandwich.getBreadType() + " at " + yourSandwich.getPrice());
		
	}

}
