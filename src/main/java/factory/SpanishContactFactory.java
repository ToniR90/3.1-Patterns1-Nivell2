package factory;

import contact.address.Address;
import contact.phone.PhoneNumber;
import contact.address.SpanishAddress;
import contact.phone.SpanishPhoneNumber;

public class SpanishContactFactory implements ContactAbstractFactory {

    @Override
    public Address createAddress(String street, String postalCode, String city) {
        return new SpanishAddress(street , postalCode , city);
    }

    @Override
    public PhoneNumber createPhoneNumber(String localNumber) {
        return new SpanishPhoneNumber(localNumber);
    }
}
