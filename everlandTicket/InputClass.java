package everlandTicket;

import java.time.LocalDate;
import java.util.Scanner;

public class InputClass {	
	
	private Scanner scan = null;
	private PrintClass print = null;
	
	public InputClass() {
		scan = new Scanner(System.in);
		print = new PrintClass();
	}
	
	public int inputTicketType() {
		int ticketType = 0;
		do {
			print.printTicketType();
			ticketType = scan.nextInt();
		} while (!(ticketType == 1 || ticketType == 2
				|| ticketType == 3 || ticketType == 4));	
		return ticketType;
	}
	public int inputAmount() {
		int ticketAmount = 0;
		do {
			print.printCount();
			ticketAmount = scan.nextInt();
		} while(ticketAmount <= 0 || ticketAmount > 10);
		return ticketAmount;
	}
	public int inputDiscountType() {
		int discountType = 0;
		do {
			print.printDiscountType();
			discountType = scan.nextInt();
		} while(!(discountType == 1 || discountType == 2 || discountType == 3 
			   || discountType == 4 || discountType == 5));
		return discountType;
	}
	public int inputContinue() {
		int repeat;
		print.printContiue();
		repeat = scan.nextInt();
		return repeat;
	}

}
