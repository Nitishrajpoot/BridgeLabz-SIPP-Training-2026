package AddressBookApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class AddressBook {

    ArrayList<Contact> contactList = new ArrayList<>();
    HashMap<String, Contact> nameMap = new HashMap<>();
    HashSet<String> phoneSet = new HashSet<>();

    // Add Contact
    public void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate Phone Number!");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contactList.add(c);
        nameMap.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added");
    }

    // Search Contact
    public void searchContact(String name) {

        if (nameMap.containsKey(name)) {
            System.out.println(nameMap.get(name));
        } else {
            System.out.println("Contact Not Found");
        }
    }

    // Delete Contact
    public void deleteContact(String name) {

        Contact c = nameMap.remove(name);

        if (c != null) {
            contactList.remove(c);
            phoneSet.remove(c.phone);

            System.out.println("Contact Deleted");
        } else {
            System.out.println("Contact Not Found");
        }
    }

    // Display Sorted
    public void displayContacts() {

        Collections.sort(contactList);

        System.out.println("\nSorted Contact List:\n");

        for (Contact c : contactList) {
            System.out.println(c);
        }
    }
}