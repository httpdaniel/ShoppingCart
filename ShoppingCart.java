import java.util.ArrayList;

public class ShoppingCart
{
    private final long cartId;
    private String timeStamp;
    private ArrayList<Item> items;
    private int total;
    private Customer customer;
    private boolean closed = false;
    
    public ShoppingCart(Customer customer)
    {
        this.customer = customer;
        items = new ArrayList<Item>();
        cartId = makeCartId();
    }
    
    public long makeCartId(){
        return (long)Math.random() * 99999999999999L;
    }
    
    public void addItem(Item item){
        if (!closed){
            items.add(item);
        } else {
            System.out.println("Sorry The Shopping Cart is closed");
        }
    }
    
    public void removeItem(int index){
        if(index >= 0 && index < items.size()){
            items.remove(index);
        }
     }
    
    public double getTotal() {
        double total = 0;
        
        for(Item item: items){
            total += item.getPrice();
        }
        
        return total;
    }
    
    public long getCartId(){
        return cartId;
    }
    
    public Customer getCustomer() {
        return customer; 
    }
    
    public void printItems(){
        for (int i = 0; i < items.size(); i++){
            System.out.println(items.get(i));
        }
    }
    
    public boolean hasItems(){
        if(!items.isEmpty()){
            return true;
        } return false;
    }
    
    public Item getNext(int i){
        return items.get(i);
    }
    
    public int getSize(){
        return items.size();
    }
    
    public void clear(){
        for (int i = 0; i < items.size(); i++){
            items.remove(i);
        }
    }
    
    public void close(){
        this.closed = true;
        this.items.clear();
    }
}





