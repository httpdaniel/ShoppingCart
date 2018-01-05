import java.util.ArrayList;

public class Order
{
    private double orderTotal;
    private final long orderId;
    private final Customer customer;
    private ArrayList<Item> orderedItems = new ArrayList<Item>();
    private Address delivery;
    private Address billing;
    private Payment payment;
    private Email email;

    public Order(ShoppingCart cart)
    {
        orderId = makeOrderId();
        customer = cart.getCustomer();
        
        int i = 0;
        while(cart.hasItems() && i < cart.getSize()){
            Item item = cart.getNext(i); i++;
            orderedItems.add(item);
            orderTotal += item.getPrice();
        }
        
        cart.close();
    }
    
    public void printCart(){
        for (int i = 0; i < orderedItems.size(); i++){
            System.out.println(orderedItems.get(i));
        }
    }
    
    public long makeOrderId(){
	long id = (long)(1000000000L * Math.random());
	return id;
    }
    
    public void setDeliveryAddress(Address delivery){
        this.delivery = delivery;
    }
    
    public void setBillingAddress(Address billing){
        this.billing = billing;
    }
    
    public void Pay(Payment payment){
        this.payment = payment;
        if (payment.isValid()){
            System.out.println("Payment successful. An email will be sent shortly with order details.\n\n");
            }
        }
    
    public long getOrderId(){
        return orderId;
    }
    
    public double getOrderTotal(){
        return orderTotal;
    }
    
    public ArrayList getOrder(){
        return orderedItems;
    }
}
