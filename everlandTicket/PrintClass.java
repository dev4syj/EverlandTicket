package everlandTicket;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PrintClass {

 	public void printContiue() {
		System.out.println("\nDo you want to order more?");
		System.out.println("0.YES");
		System.out.println("1.NO");
		System.out.print(" => ");
	}	
	public void printTicketType() {
		System.out.println("\nChoose your ticket type!");
		System.out.println("1.Type A");
		System.out.println("2.Type B");
		System.out.println("3.Type C");
		System.out.println("4.Type D");
		System.out.print(" => ");
	}
	public void printBirthDate() {
		System.out.print("\nPlease enter your birth date in the format yyyy-mm-dd: ");
	}	
	
	public void printError() {
		System.out.println("Invalid input.");
	}
	
	public void printCount() {
		System.out.println("\n* Max amount is 10 *");
		System.out.println("How many tickets do you want?");
		System.out.print(" => ");
	}
	public void printDiscountType() {
		System.out.println("\nChoose your discount type!");
		System.out.println("1.None");
		System.out.println("2.The disabled");
		System.out.println("3.National Merit");
		System.out.println("4.Multi-child");
		System.out.println("5.Pregnant");
		System.out.print(" => ");
	}	
	public void pirntTicketHeader() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		
		System.out.println("\nThank you for your order!\n");
		System.out.println("================Everland=================");
		System.out.printf("%15s%s", " ", "Valid only on purchase day");
		System.out.printf("\n%16s%s %10s\n\n", " ", "Purchase date:", dateFormat.format(calendar.getTime()));
	}	
	public void printTicketType(int ticketType) {
		if (ticketType == 1) {
			System.out.printf("%7s   ", "TicketA");
		} else if (ticketType == 2){
			System.out.printf("%7s   ", "TicketB");
		} else if (ticketType == 3){
			System.out.printf("%7s   ", "TicketC");
		} else if (ticketType == 4){
			System.out.printf("%7s   ", "TicketD");
		}
	}
	public void printAgeGroup(int ageGroup) {
		if(ageGroup == 1) {
			System.out.printf("%11s ", "Baby");
		}  else if(ageGroup == 2) {
			System.out.printf("%11s ", "Soin/Old");
		} else if(ageGroup == 3) {
			System.out.printf("%11s ", "Daein/Youth");
		}
	}
	public void printTicketPrice(int ticketCount, int totalPrice) {
		DecimalFormat numberFormat = new DecimalFormat("###,###,###,###,###");	
		System.out.printf("%2s %2d %9s %3s\n", "*",ticketCount, numberFormat.format(totalPrice), "won");
	}
	public void printDiscountApplied(int discountType) {
		if (discountType == 1) {
			System.out.println();
		} else if (discountType == 2) {
			System.out.println("*Discount applied(type:The disabled)\n");
		} else if (discountType == 3) {
			System.out.println("*Discount applied(type:National Merit)\n");
		} else if (discountType == 4) {
			System.out.println("*Discount applied(type:Multi-child)\n");
		} else if (discountType == 5) {
			System.out.println("*Discount applied(type:Pregnant)\n");
		}	
	}
	public void printSumofAllPrices(int sumAllPrices) {
		DecimalFormat numberFormat = new DecimalFormat("###,###,###,###,###");	
		System.out.printf("%11s %15s %9s %3s\n", "Total price", " ", numberFormat.format(sumAllPrices), "won");	
	}
	public void printEnd() {
		System.out.println("=========================================");
	}
}
