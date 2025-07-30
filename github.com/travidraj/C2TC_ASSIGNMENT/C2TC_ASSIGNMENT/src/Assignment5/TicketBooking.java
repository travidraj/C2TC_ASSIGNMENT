package Assignment5;

public class TicketBooking {
	
	    private String stageEvent;
	    private String customer;
	    private Integer noOfSeats;

	    public TicketBooking() {
	    }

	    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }

	    // Getters
	    public String getStageEvent() {
	        return stageEvent;
	    }

	    public String getCustomer() {
	        return customer;
	    }

	    public Integer getNoOfSeats() {
	        return noOfSeats;
	    }

	    // Setters
	    public void setStageEvent(String stageEvent) {
	        this.stageEvent = stageEvent;
	    }

	    public void setCustomer(String customer) {
	        this.customer = customer;
	    }

	    public void setNoOfSeats(Integer noOfSeats) {
	        this.noOfSeats = noOfSeats;
	    }

	    // Overloaded methods for payment
	    public void makePayment(double amount) {
	        System.out.printf("Amount %.1f paid in cash\n", amount);
	    }

	    public void makePayment(double amount, String walletNumber) {
	        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
	    }

	    public void makePayment(String holderName, double amount, String creditCardType, String ccv) {
	        System.out.println("Holder name:" + holderName);
	        System.out.printf("Amount %.1f paid using %s card\n", amount, creditCardType);
	        System.out.println("CCV:" + ccv);
	    }

	    // Display details
	    public void displayDetails() {
	        System.out.println("Stage event:" + stageEvent);
	        System.out.println("Customer:" + customer);
	        System.out.println("Number of seats:" + noOfSeats);
	    }
	}


