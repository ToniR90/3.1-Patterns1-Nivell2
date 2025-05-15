package contact.address;

public class GermanAddress extends BaseAddress {

    public GermanAddress(String street, String postalCode, String city) {
        super(street, postalCode, city);
    }

    @Override
    public String getFullAddress() {
        return "Street: " + street + "\n" +
                "Postal code: " + postalCode + "\n" +
                "City: " + city + ", Germany";
    }
}
