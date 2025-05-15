package contactbook;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {

    private List<Contact> contacts;

    public ContactBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void showContacts(){
        if(contacts.isEmpty()){
            System.out.println("There's no contacts yet");
            return;
        }

        for(Contact contact : contacts){
            System.out.println(contact.getAddress().getFullAddress());
            System.out.println("Phone Number: " + contact.getPhoneNumber().getInternationalNumber());
            System.out.println("|------------------------------------------------------------|");
        }
    }
}
