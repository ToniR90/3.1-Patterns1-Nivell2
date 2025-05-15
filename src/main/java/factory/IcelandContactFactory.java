package factory;

import contact.address.Address;
import contact.address.IcelandAddress;
import contact.phone.IcelandPhoneNumber;
import contact.phone.PhoneNumber;

public class IcelandContactFactory implements ContactAbstractFactory{

    @Override
    public Address createAddress(String street, String postalCode, String city) {
        return new IcelandAddress(street , postalCode , city);
    }

    @Override
    public PhoneNumber createPhoneNumber(String localNumber) {
        return new IcelandPhoneNumber(localNumber);
    }
}
