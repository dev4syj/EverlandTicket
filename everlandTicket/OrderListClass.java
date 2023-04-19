package everlandTicket;

public class OrderListClass {
	private int ageGroup;
	private int totalPrice;
	private int ticketType;
	private int ticketCount;
	private int discountType;

	public OrderListClass(int ageGroup, int totalPrice, int ticketType, int ticketCount, int discountType) {
		this.ageGroup = ageGroup;
		this.totalPrice = totalPrice;
		this.ticketType = ticketType;
		this.ticketCount = ticketCount;
		this.discountType = discountType;
	}

	public int getAgeGroup() {
		return this.ageGroup;
	}

	public int getTotalPrice() {
		return this.totalPrice;
	}
	
	public int getTicketType() {
		return this.ticketType;
	}
	
	public int getTicketCount() {
		return this.ticketCount;
	}
	
	public int getDiscountType() {
		return this.discountType;
	}
	
	
}
