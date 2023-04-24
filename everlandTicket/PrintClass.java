package everlandTicket;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PrintClass {

 	public void printContiue() {
		System.out.println(LanguageClass.CONTINUE_QUESTION);
	}	
	public void printTicketType() {
		System.out.println(LanguageClass.TICKET_TYPE_QUESTION);
	}
	public void printBirthDate() {
		System.out.print(LanguageClass.BIRTH_DATE_QUESTION);
	}	
	
	public void printError() {
		System.out.println(LanguageClass.ERROR_MESSAGE);
	}
	
	public void printCount() {
		System.out.println(LanguageClass.AMOUNT_QUESTION);
	}
	public void printDiscountType() {
		System.out.println(LanguageClass.DISCOUNT_TYPE_QUESTION);
	}	
	public void pirntTicketHeader() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		
		System.out.println(LanguageClass.THANK_YOU_MESSAGE);
		System.out.println(LanguageClass.HEADER_LINE);
		System.out.printf("%s",LanguageClass.PURCHASE_NOTICE);
		System.out.printf("\n%s %10s\n\n", LanguageClass.PURCHASE_DATE, dateFormat.format(calendar.getTime()));
	}	
	public void printTicketType(int ticketType) {
		if (ticketType == 1) {
			System.out.printf("%-5s ", LanguageClass.TICKET_TYPE_A);
		} else if (ticketType == 2){
			System.out.printf("%-5s ", LanguageClass.TICKET_TYPE_B);
		} else if (ticketType == 3){
			System.out.printf("%-5s ", LanguageClass.TICKET_TYPE_C);
		} else if (ticketType == 4){
			System.out.printf("%-5s ", LanguageClass.TICKET_TYPE_D);
		}
	}
	public void printAgeGroup(int ageGroup) {
		if(ageGroup == 1) {
			System.out.printf("%10s ", LanguageClass.AGE_GROUP_BABY);
		}  else if(ageGroup == 2) {
			System.out.printf("%10s ", LanguageClass.AGE_GROUP_DAEIN);
		} else if(ageGroup == 3) {
			System.out.printf("%10s ", LanguageClass.AGE_GROUP_SOIN);
		}
	}
	public void printTicketPrice(int ticketCount, int totalPrice) {
		DecimalFormat numberFormat = new DecimalFormat("###,###,###,###,###");	
		System.out.printf("%2s %2d %11s %3s\n", "*",ticketCount, numberFormat.format(totalPrice), LanguageClass.CURRENCY_UNIT);
	}
	public void printDiscountApplied(int discountType) {
		if (discountType == 1) {
			System.out.println(LanguageClass.DISCOUNT_TYPE_DISABLED_APPLIED);
		} else if (discountType == 2) {
			System.out.println();
		} else if (discountType == 3) {
			System.out.println(LanguageClass.DISCOUNT_TYPE_NATIONAL_MERIT_APPLIED);
		} else if (discountType == 4) {
			System.out.println(LanguageClass.DISCOUNT_TYPE_MULTI_CHILD_APPLIED);
		} else if (discountType == 5) {
			System.out.println(LanguageClass.DISCOUNT_TYPE_PREGNANT_APPLIED);
		}	
	}
	public void printSumofAllPrices(int sumAllPrices) {
		DecimalFormat numberFormat = new DecimalFormat("###,###,###,###,###");	
		System.out.printf("%-11s %23s %3s\n", LanguageClass.TOTAL_PRICE, numberFormat.format(sumAllPrices), LanguageClass.CURRENCY_UNIT);	
	}
	public void printEnd() {
		System.out.println("=========================================");
	}
}
