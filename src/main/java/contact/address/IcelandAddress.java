package contact.address;

public class IcelandAddress extends BaseAddress {

    public IcelandAddress(String street, String postalCode, String city) {
        super(street, postalCode, city);
    }

    @Override
    public String getFullAddress() {
        return "Street: " + street + "\n" +
                "Postal code: " + postalCode + "\n" +
                "City: " + city + ", Iceland";
    }
}
