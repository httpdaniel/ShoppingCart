public class Address
{
    // instance variables - replace the example below with your own
    private String street;
    private String city;
    private int zip;
    private String country;

    /**
     * Constructor for objects of class Address
     */
    public Address(String street, String city, int zip, String country)
    {
        // initialise instance variables
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.country = country;
    }
    
    public String getAddress(){
        String address = street+", "+city+", "+zip+", "+country;
        return address;
    }
}
