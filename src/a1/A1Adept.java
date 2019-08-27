package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Number of food items available
		int itemcount = scan.nextInt();
		// Creates a names array and a corresponding price array
		String[] foodnames = new String[itemcount];
		double[] prices = new double[itemcount];
		// Fills in each array
		for (int i = 0; i < itemcount; i++) {
			foodnames[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		// Number of customers
		int custcount = scan.nextInt();
		// Creates values for the biggest, smallest, and total cost values
		String bigfirst = "";
		String biglast = "";
		double biggest = 0;
		String smallfirst = "";
		String smalllast = "";
		double smallest = Double.MAX_VALUE;
		double totalcost = 0;
		// A for loop which runs a function for each customer
		for (int i = 0; i < custcount; i++) {
			String firstname = scan.next();
			String lastname = scan.next();
			// Number of items each customer purchases
			int basketcount = scan.Int();
			// Takes the total cost of the basket
			double baskettotal = 0;
			for (int j = 0; j < basketcount; j++) {
				int quantity = scan.nextInt();
				String itemname = scan.next();
				// Retrieves the item prices from an array
				// Adds this price to the basket total
				for (int k = 0; k < itemcount; k++) {
					if (itemname == foodnames[k]) {
						baskettotal += prices[k] * quantity;
					}
				}
			}
			// Creates a new customer with the biggest basket if needed
			if (baskettotal > biggest) {
				bigfirst = firstname;
				biglast = lastname;
				biggest = baskettotal;
			}
			// Creates a new customer with the smallest basket if needed
			if (baskettotal < smallest) {
				smallfirst = firstname;
				smalllast = lastname;
				smallest = baskettotal;
			}
			// Adds the customer's basket total cost to the overall total
			totalcost += baskettotal;
		}
		// Closes the scanner
		scan.close();
		// Calculates the average cost
		double averagecost = totalcost / custcount;
		// Prints out the biggest and smallest customer's info
		System.out.println("Biggest: "+bigfirst+" "+biglast+" ("+String.format("%.2f", biggest)+")");
		System.out.println("Smallest: "+smallfirst+" "+smalllast+" ("+String.format("%.2f", smallest)+")");
		// Prints out the average cost info
		System.out.println("Average: "+String.format("%.2f", averagecost));
	}
}
