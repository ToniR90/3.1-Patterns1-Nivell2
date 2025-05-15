package app;

import factory.ContactAbstractFactory;
import factory.GermanContactFactory;
import factory.SpanishContactFactory;
import contact.address.Address;
import contactbook.Contact;
import contactbook.ContactBook;
import contact.phone.PhoneNumber;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        ContactAbstractFactory spanishFactory = new SpanishContactFactory();

        Address address1 = spanishFactory.createAddress("Carrer de la Pau", "46001", "València");
        PhoneNumber phone1 = spanishFactory.createPhoneNumber("612345678");

        Contact contact1 = new Contact(address1, phone1);

        contactBook.addContact(contact1);

        ContactAbstractFactory germanFactory = new GermanContactFactory();
        Address address2 = germanFactory.createAddress("Hauptstraße", "10115", "Berlin");
        PhoneNumber phone2 = germanFactory.createPhoneNumber("015112345678");
        Contact contact2 = new Contact(address2, phone2);
        contactBook.addContact(contact2);


        contactBook.showContacts();
    }
}