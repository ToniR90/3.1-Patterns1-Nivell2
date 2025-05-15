package contact.phone;

public class IcelandPhoneNumber extends BasePhoneNumber {

    public IcelandPhoneNumber(String number) {
        super(number);
    }

    @Override
    public String getInternationalNumber() {
        return "+354" + number;
    }
}
