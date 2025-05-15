package factory;

import contact.address.Address;
import contact.address.GermanAddress;
import contact.phone.GermanPhoneNumber;
import contact.phone.PhoneNumber;

public class GermanContactFactory implements ContactAbstractFactory{

    @Override
    public Address createAddress(String street, String postalCode, String city) {
        return new GermanAddress(street , postalCode , city);
    }

    @Override
    public PhoneNumber createPhoneNumber(String localNumber) {
        return new GermanPhoneNumber(localNumber);
    }
}
