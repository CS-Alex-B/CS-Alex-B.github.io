import java.util.Scanner;
public class LabThree {
	
	public static void main(String[] args) {

		// Alex Blackwell
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to the Stock Transaction Program!");
		
		System.out.println("Enter the initial price paid for 1 share of Pelican Corp.:");
		
		double pricepaid = key.nextDouble();
		
		System.out.println("Enter the number of Pelican Corp. shares purchased:");
		
		double sharespurchased = key.nextDouble();
		
		//input validation
		if (sharespurchased <= 0) {
			
			System.out.println("Invalid value entered for number of shares purchased!");
			System.out.println("Exiting the program!");
			System.exit(0); //exits the program
		}
		
		double totalcost = pricepaid * sharespurchased;
		
		System.out.println("Total Cost for all shares purchased: $"+totalcost);
		
		double commissionpaidp = totalcost * 0.02;
		
		System.out.println("Amount of commission paid to the stockbroker during purchase: $"+commissionpaidp);
		
		System.out.println("Enter the sale price of 1 share of Pelican Corp.:");
		
		double saleprice = key.nextDouble();
		
		System.out.println("Enter the number of Pelican Corp. shares you want to sell:");
		
		double sharestosell = key.nextDouble();
		
		//input validation
		if (sharestosell > sharespurchased) {
			
			System.out.println("Invalid value entered. The maximum of shares that can be sold is:"+sharespurchased);
			System.out.println("Exiting the program!");
			System.exit(0); //exits the program
		}
		
		double totalsell = saleprice * sharestosell;
		
		System.out.println("Total Sells Amount: $"+totalsell);
		
		double commissionpaids = totalsell * 0.02;
		
		System.out.println("Amount of commission paid to the stockbroker during sell: $"+commissionpaids);
		
		double finaltotal = totalsell - (totalcost + commissionpaidp + commissionpaids);
		
		//input validation
		if (finaltotal < 0) {
			System.out.println("The user made a loss of $" +finaltotal+ " on the stock sale");
		}
		else {
			System.out.println("The user made a gain of $" +finaltotal+ " on the stock sale");
		}
		
	}

}
