package contact.phone;

public class SpanishPhoneNumber extends BasePhoneNumber {

    public SpanishPhoneNumber(String number) {
        super(number);
    }

    @Override
    public String getInternationalNumber() {
        return "+34" + number;
    }
}
