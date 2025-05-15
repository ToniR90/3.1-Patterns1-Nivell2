package factory;

import contact.address.Address;
import contact.phone.PhoneNumber;

public interface ContactAbstractFactory {

    Address createAddress(String street , String postalCode , String city);
    PhoneNumber createPhoneNumber(String localNumber);
}
