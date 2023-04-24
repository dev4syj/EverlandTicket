package everlandTicket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
	
public class EverlandTicket{
	int ticketType, ageGroup, age,
		ticketAmount, discountType;
	int totalPrice = 0;
	LocalDate birthDayNumbers;
	
	List<OrderListClass> data = new ArrayList<OrderListClass>();
	OrderListClass orderList = null; 
	private PrintClass print = null;
	private CalculateClass calculate = null;
	private InputClass input = null;
	
 	public EverlandTicket() {
		print = new PrintClass();
		calculate = new CalculateClass();
		input = new InputClass();
	}
		
	public static void main(String[] args) {		
		EverlandTicket ever = new EverlandTicket();
		InputClass input = new InputClass();
		int repeat;
		do {
			ever.input();
			ever.calculateResult();
			ever.saveData();
			repeat = input.inputContinue();
		} while (repeat == 0);
		ever.output();
	}	
	
	void input() {
		Locale currentLocale = Locale.getDefault();
		LanguageClass.languageSelect(currentLocale.getCountry());
		ticketType = input.inputTicketType();
		birthDayNumbers = calculate.getValidBirthDate();
		ticketAmount = input.inputAmount();
		discountType = input.inputDiscountType();	
	}

	void calculateResult() {
		age = calculate.calculateAge(birthDayNumbers);
		ageGroup = calculate.checkAgeGroup(age);
		totalPrice = calculate.checkPrice(ticketType, ageGroup) * ticketAmount;
		totalPrice = calculate.calculatePrice(discountType, totalPrice);
	}
	
	void saveData() {
		orderList = new OrderListClass(ageGroup, totalPrice,
									   ticketType, ticketAmount, discountType);
		data.add(orderList); // store at data list like {ageGroup, totalPrice, ...}
	}
	
	void output() {			
		print.pirntTicketHeader();	
		int sumAllPrices = 0;
		for (OrderListClass order : data) { // pick value from data list and print format in order list 
											// repeat size of data
			ticketType = order.getTicketType();
			ageGroup = order.getAgeGroup();
			totalPrice = order.getTotalPrice();
			ticketAmount = order.getTicketCount();
			discountType = order.getDiscountType();
			sumAllPrices += totalPrice;
			
			print.printTicketType(ticketType);			
			print.printAgeGroup(ageGroup);		
			print.printTicketPrice(ticketAmount, totalPrice);			
			print.printDiscountApplied(discountType);	
		}
		print.printSumofAllPrices(sumAllPrices);
		print.printEnd();
	}
}
