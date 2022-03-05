package classes;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> data;

    public ContactList() {
        this.data = new ArrayList<>();
    }

    public void addContact(Contact newContact) {
        this.data.add(newContact);
    }

    public void setData(ArrayList<Contact> data) {
        this.data = data;
    }

    public ArrayList<Contact> getData() {
        return data;
    }
}
