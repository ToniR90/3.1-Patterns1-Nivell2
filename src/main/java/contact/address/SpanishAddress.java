package contact.address;

public class SpanishAddress extends BaseAddress {

    public SpanishAddress(String street, String postalCode, String city) {
        super(street, postalCode, city);
    }

    @Override
    public String getFullAddress() {
        return "Street: " + street + "\n" +
                "Postal code: " + postalCode + "\n" +
                "City: " + city + ", Spain";
    }
}
