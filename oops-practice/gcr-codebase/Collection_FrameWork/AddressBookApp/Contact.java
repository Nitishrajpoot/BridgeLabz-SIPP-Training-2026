package AddressBookApp;


public class Contact implements Comparable<Contact> {

    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int compareTo(Contact c) {
        return this.name.compareToIgnoreCase(c.name);
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Phone: " + phone +
                ", Email: " + email;
    }
}
