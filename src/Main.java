//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        MobilePhone mobilePhone = new MobilePhone("+447448263772");

        // Create contact list
        mobilePhone.addNewContact(Contact.createContact("Bob", "31415926"));
        mobilePhone.addNewContact(Contact.createContact("Alice", "16180339"));
        mobilePhone.addNewContact(Contact.createContact("Tom", "11235813"));
        mobilePhone.addNewContact(Contact.createContact("Jane", "23571113"));
        System.out.println("After just adding the contacts.");
        mobilePhone.printContacts();

        // Update the contact
        Contact oldContact = mobilePhone.queryContact("Tom");
        Contact newContact = Contact.createContact(oldContact.getName(), "22235813");
        mobilePhone.updateContact(oldContact, newContact);
        System.out.println("After updating Tom contact.");
        mobilePhone.printContacts();

        // Remove a contact
        mobilePhone.removeContact(mobilePhone.queryContact("Tom"));
        System.out.println("After removing Jane contact.");
        mobilePhone.printContacts();

        // Try to add an existing contact
        System.out.println(mobilePhone.addNewContact(Contact.createContact("Bob", "31415926")));
    }
}