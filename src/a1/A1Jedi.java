package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// First number is the number of food items available
		int itemcount = scan.nextInt();
		// Creates a food names, price, quantity, and customers array
		String[] foodnames = new String[itemcount];
		int[] foodcusts = new int[itemcount];
		int[] foodquants = new int[itemcount];
		// Fills in the values for the food array, with starting values of 0 
		// for food customers and quantity
		for (int i = 0; i < itemcount; i++) {
			foodnames[i] = scan.next();
			// Scan through the food prices
			scan.nextDouble();
			foodcusts[i] = 0;
			foodquants[i] = 0;
		}
		System.out.println("Hello");
		// Next scan item is the number of customers
		int custcount = scan.nextInt();
		// Add to food quantities for each customer
		for (int i=0; i<custcount; i++) {
			// Scan through the customer names
			scan.next();
			scan.next();
			// Next value is the number of food items
			int basketcount = scan.nextInt();
			// Add basket items to the food totals
			for (int j = 0; j<basketcount; j++) {
				int quantity = scan.nextInt();
				String itemname = scan.next();
				for (int k=0; k<itemcount; k++) {
					if (itemname.equals(foodnames[k])) {
						foodcusts[k]++;
						foodquants[k] += quantity;
					}
				}
			}
		}
		// Close the scanner since it is no longer needed
		scan.close();
		// Convert each food name, customer count, and quantity into print form
		for (int i = 0; i < itemcount; i++) {
			// Using the word "No" if customer count is zero
			if (foodcusts[i] == 0) {
				System.out.println("No customers bought "+foodnames[i]);
			} else {
				// In all other cases
				System.out.println(foodcusts[i]+" customers bought "+foodquants[i]+" "+foodnames[i]);
			}
		}
	}
}
