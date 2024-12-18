import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    // Add a new contact and return the result
    public boolean addNewContact(Contact contact) {

        // If the contact doesn't exist, add it and return true
        if (findContact(contact) < 0) {
            myContacts.add(contact);
            return true;
        }

        return false;
    }

    // Update an existing contact and return result
    public boolean updateContact(Contact oldContact, Contact newContact) {

        // If the old contact exist then replace with new one and return true
        int oldContactIndex = findContact(oldContact);
        if (oldContactIndex >= 0) {
            myContacts.set(oldContactIndex, newContact);
            return true;
        }

        return false;
    }

    // Remove an existing contact and return the result
    public boolean removeContact(Contact contact) {

        return myContacts.remove(contact);
    }

    // Return the index of an existing contact
    private int findContact(Contact contact) {

        for (Contact listContact : myContacts) {
            if (listContact.getName().equalsIgnoreCase(contact.getName())) {
                return myContacts.indexOf(listContact);
            }
        }
        return -1;
    }

    // Return the result of number after checking with myNumber
    private int findContact(String myNumber) {
        if (myNumber.equals(this.myNumber)) {
            return 0;
        }

        return -1;
    }

    // Return the Contact object if any matching name found
    public Contact queryContact(String name) {

        for (Contact contact : myContacts) {
            if (name.equalsIgnoreCase(contact.getName())) {
                return contact;
            }
        }

        return null;
    }

    public void printContacts() {

        int i = 1;
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            System.out.println(i + ". "+ contact.getName() + " -> " + contact.getPhoneNumber());
            i++;
        }
    }
}
