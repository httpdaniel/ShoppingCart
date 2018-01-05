public class Payment
{
    // instance variables - replace the example below with your own
    private Customer customer;
    private Address billingAddress;
    private int cardNumber;
    private String date;
    private String cardType;
    private boolean valid;

    /**
     * Constructor for objects of class Payment
     */
    public Payment(Customer customer, Address billingAddress, String cardType, int cardNumber, String date)
    {
        // initialise instance variables
        this.customer = customer;
        this.billingAddress = billingAddress;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.date = date;
        validate();
    }
    
    public void validate(){
        if (cardType.equalsIgnoreCase("Visa")||cardType.equalsIgnoreCase("Mastercard")){
            valid = true;
        }
    }
    
    public boolean isValid(){
        return valid;
    }
}
