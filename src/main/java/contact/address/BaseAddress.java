package contact.address;

public abstract class BaseAddress implements Address {

    protected String street;
    protected String postalCode;
    protected String city;

    public BaseAddress(String street, String postalCode, String city) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }
}
