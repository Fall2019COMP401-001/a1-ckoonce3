package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// First input is an integer which represents the number of customers
		int count = scan.nextInt();
		// Creates values for customer name and number of items purchased
		for (int i = 0; i < count; i++) {
			String firstname = scan.next();
			String lastname = scan.next();
			int items = scan.nextInt();
			// Creates a total price value
			double total = 0;
			// For each item, multiply the quantity by the price and add to the total
			for (int j = 0; j < items; j++) {
				int quantity = scan.nextInt();
				String itemname = scan.next();
				double price = scan.nextDouble();
				total += price * quantity;
			}
			// Print out the first initial of the first name, followed by the last name,
			// Followed by the total cost
			String output = firstname.charAt(0) + ". " + lastname + ": " + total;
			System.out.println(output);
		}
	scan.close();	
	}
}
