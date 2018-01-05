public class Address
{
    private String street;
    private String city;
    private int zip;
    private String country;

    public Address(String street, String city, int zip, String country)
    {
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
