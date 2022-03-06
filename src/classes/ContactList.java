package classes;

import java.util.ArrayList;


public class ContactList {
    private ArrayList<Contact> data;

    public ContactList() {
        this.data = new ArrayList<>();
    }

    public void printAllData() {
        System.out.println("");

        if (this.data.size() <= 0) {
            System.out.println(Config.NOT_FOUND + "\n");
        }

        for (int i = 0; i < this.data.size(); i++) {
            System.out.print(i + ". ");
            this.data.get(i).printData();
        }

        System.out.println("");
    }

    public void updateContact() {
        this.printAllData();

        final String[] prompt = Config.PROMPT_UPDATE_CONTACT;

        int i = 0;


        String userInputIndex = InputCollector.getUserInput(Config.PROMPT_ENTER_INDEX + "update");

        while (true) {
            int indexAt = Integer.parseInt(userInputIndex);

            String userInput = InputCollector.getUserInput(prompt[i]);


            // validation

            if (prompt[i].equals(Config.PROMPT_ENTER_NAME)) {
                // validate name


                this.data.get(indexAt).setName(userInput);
            } else if (prompt[i].equals(Config.PROMPT_ENTER_MOBILE)) {
                // validate mobile

                this.data.get(indexAt).setPhone(userInput);


            } else if (prompt[i].equals(Config.PROMPT_ENTER_WORK)) {
                this.data.get(indexAt).setWork(userInput);
            } else if (prompt[i].equals(Config.PROMPT_ENTER_HOME)) {
                this.data.get(indexAt).setHome(userInput);
            } else {
                this.data.get(indexAt).setCity(userInput);
                break;
            }

            i++;
        }

        System.out.println("updated contact");
        System.out.println("");
        System.out.println("Successfully updated");
    }

    public void removeContact() {
        this.printAllData();

        String userInput = InputCollector.getUserInput(Config.PROMPT_ENTER_INDEX + "remove");

        int indexAt = Integer.parseInt(userInput);
        // validation


        Contact removedContact = this.remove(indexAt);

        System.out.println("Successfully removed " + removedContact.getName());
    }

    public void addNewContact() {
        Contact newContact = new Contact();
        final String[] prompt = Config.PROMPT_CREATE_CONTACT;

        String userInput = null;

        int i = 0;
        while (true) {
            userInput = InputCollector.getUserInput(prompt[i]);

            if (prompt[i].equals(Config.PROMPT_ENTER_NAME)) {
                // validate name
                if (this.isRequiredDataEmpty(userInput)) {
                    System.out.println(Config.ERROR_MESSAGE_IS_REQUIRED() + "\n");
                    continue;
                }

                newContact.setName(userInput.trim());
            } else if (prompt[i].equals(Config.PROMPT_ENTER_MOBILE)) {
                // validate mobile
                if (this.isRequiredDataEmpty(userInput)) {
                    System.out.println(Config.ERROR_MESSAGE_IS_REQUIRED() + "\n");
                    continue;
                }

                if (this.isDuplicatedEntry(newContact, userInput)) {
                    // validate duplicated entry
                    System.out.println(Config.ERROR_MESSAGE_DUPLICATE_ENTRY("You must enter different info. "
                            + "Try again.") + "\n");
                    continue;
                }

                newContact.setPhone(userInput.trim());
            } else if (prompt[i].equals(Config.PROMPT_ENTER_WORK)) {
                newContact.setWork(userInput.trim());
            } else if (prompt[i].equals(Config.PROMPT_ENTER_HOME)) {
                newContact.setHome(userInput.trim());
            } else {
                newContact.setCity(userInput.trim());
                break;
            }

            i++;
        }

        this.addContact(newContact);

        System.out.println("new contact");
        newContact.printData();
        System.out.println("");
        System.out.println("Successfully added a new contact!");
    }

    private boolean isRequiredDataEmpty(String data) {
        return data.trim().equals("");
    }

    private boolean isDuplicatedEntry(Contact newContact, String mobileInfo) {
        for (Contact existingContact : this.getData()) {
            String nameOfExistingContact = existingContact.getName();
            String mobileOfExistingContact = existingContact.getPhone();
            String nameOfNewContact = newContact.getName();

            if (nameOfExistingContact.equals(nameOfNewContact) && mobileOfExistingContact.equals(mobileInfo.trim())
            ) {
                return true;
            }
        }
        return false;
    }

    private Contact remove(int indexAt) {
        return this.data.remove(indexAt);
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
