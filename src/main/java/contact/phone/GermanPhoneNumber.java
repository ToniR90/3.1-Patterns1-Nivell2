package contact.phone;

public class GermanPhoneNumber extends BasePhoneNumber {

    public GermanPhoneNumber(String number) {
        super(number);
    }

    @Override
    public String getInternationalNumber() {
        return "+49" + number;
    }
}
