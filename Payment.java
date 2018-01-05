public class Payment
{
    private Customer customer;
    private Address billingAddress;
    private int cardNumber;
    private String date;
    private String cardType;
    private boolean valid;

    public Payment(Customer customer, Address billingAddress, String cardType, int cardNumber, String date)
    {
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
