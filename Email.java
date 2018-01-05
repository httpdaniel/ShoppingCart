public class Email
{
    private String email;
    private Customer customer;
    private Order order;
    private Address address;

    public Email(Customer customer, Order order, Address address)
    {
        this.customer = customer;
        this.order = order;
        this.address = address;
    }
    
    public void send(){
        System.out.println("To: " +customer.getEmailAddress()+"\n\n");
        System.out.println("Dear " +customer.getFirstName()+",\n\n");
        System.out.println("Thank you for your order " +order.getOrderId()+".\n\n");
        System.out.println("The items you ordered are: "+order.getOrder()+"\n\n");
        System.out.println("The total cost of these items were " +order.getOrderTotal()+ "\n\n");
        System.out.println("We will soon dispatch it to the given delivery address "+address.getAddress()+"\n\n");
    }
    
    public void invalidSend(){
        System.out.println("\nTo: " +customer.getEmailAddress()+"\n\n");
        System.out.println("Dear " +customer.getFirstName()+",\n\n");
        System.out.println("We are sorry to inform you that your order " +order.getOrderId()+" cannot be processed.\n");
        System.out.println("Unfortunately it seems your payment method is invalid.\n");
        System.out.println("Please ensure your card is either Visa or Mastercard.");
        
    }
}
