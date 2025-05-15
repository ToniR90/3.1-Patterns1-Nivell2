package contact.phone;

public abstract class BasePhoneNumber implements PhoneNumber {

    protected String number;

    public BasePhoneNumber(String number) {
        this.number = number;
    }
}
