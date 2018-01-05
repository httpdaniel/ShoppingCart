public class TransactionTest
{
    
    public static void main(String[] args)
    {
       TransactionTest test = new TransactionTest();
       test.transaction2();
    }
    
    public void transaction1(){  
        
    //1. Create New Customer
    Customer customer = new Customer("Niamh", "O'Leary", "niamhol@zmail.com");
    
    //2. Create a Shopping Cart for the customer
    ShoppingCart cart = new ShoppingCart(customer);
    
    Item item1 = new Item("Bread", 1);
    Item item2 = new Item("Milk", 2);
    Item item3 = new Item("Butter", 3);
    
    item1.setPrice(5);
    item2.setPrice(2);
    item3.setPrice(4);
    
    cart.addItem(item1);
    cart.addItem(item2);
    cart.addItem(item3);
    
    Order order = new Order(cart);
    
    Address deliveryAddress = new Address("Corrib Village", "Galway", 90210, "Ireland");
    Address billingAddress = new Address("Sandyford", "Dublin", 43560, "Ireland");
    
    Payment payment = new Payment(customer, billingAddress, "Visa", 123456, "12/04/19");
    
    order.Pay(payment);
    
    Email email = new Email(customer, order, deliveryAddress);
    
    email.send();
    }
    
    public void transaction2(){
        
        Customer customer = new Customer("Daniel", "Reilly", "daniel12@gmail.com");
        
        ShoppingCart cart = new ShoppingCart(customer);
        
        Item item1 = new Item("Wine", 1);
        Item item2 = new Item("Eggs", 2);
        Item item3 = new Item("Cheese", 3);
        
        item1.setPrice(20);
        item2.setPrice(10);
        item3.setPrice(5);
        
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        
        cart.printItems();
        
        cart.removeItem(0);
        
        Order order = new Order(cart);
        
        Address billingAddress = new Address("Adare", "Limerick", 75843, "Ireland");
        Address deliveryAddress = new Address("Mallow", "Cork", 47384, "Ireland");
        
        Payment payment = new Payment(customer, billingAddress, "Nastercard", 12345, "12/05/18");
        
        Email email = new Email(customer, order, deliveryAddress);
        
        email.invalidSend();
    }
}
