package classes;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> data;

    public ContactList() {
        this.data = new ArrayList<>();
    }

    public void printAllData() {
        if(this.data.size() <= 0 ){
            System.out.println("NOT FOUND\n");
        }


        for(int i = 0; i < this.data.size(); i++){
            System.out.print(i + ". ");
            this.data.get(i).printData();
        }
    }

    public void addNewContact() {
        Contact newContact = new Contact();
        final String[] prompt = Config.PROMPT_CREATE_CONTACT;

        int i = 0;
        while (true) {
            String userInput = InputCollector.getUserInput(prompt[i]);

            if (prompt[i].equals(Config.PROMPT_ENTER_NAME)) {
                // validate name


                newContact.setName(userInput);
            } else if (prompt[i].equals(Config.PROMPT_ENTER_MOBILE)) {
                // validate mobile

                newContact.setPhone(userInput);
            } else if (prompt[i].equals(Config.PROMPT_ENTER_WORK)) {
                newContact.setWork(userInput);
            } else if (prompt[i].equals(Config.PROMPT_ENTER_HOME)) {
                newContact.setHome(userInput);
            } else {
                newContact.setCity(userInput);
                break;
            }

            i++;
        }

        this.addContact(newContact);

        System.out.println("new contact");
        newContact.printData();
        System.out.println("");
        System.out.println(Config.ADD_CONTACT_SUCCESS);
    }


    private void addContact(Contact newContact) {
        this.data.add(newContact);
    }

    public void setData(ArrayList<Contact> data) {
        this.data = data;
    }

    public ArrayList<Contact> getData() {
        return data;
    }
}
