package classes;

public class Controller {
    public final String[] OPTIONS = Config.OPTIONS;

    public void printMainMenu() {
        System.out.println("+≡≡≡   Contact  App  ≡≡≡+");
        System.out.println("| 1. " + this.OPTIONS[0] + "  |");
        System.out.println("| 2. " + this.OPTIONS[1] + "    |");
        System.out.println("| 3. " + this.OPTIONS[2] + "     |");
        System.out.println("| 4. " + this.OPTIONS[3] + "     |");
        System.out.println("| 5. " + this.OPTIONS[4] + "               |");
        System.out.println("+=======================+");
    }

    public void execute() {
        ContactList contactList = new ContactList();

        while (true) {

            this.printMainMenu();

            String userInput = InputCollector.getUserInput(Config.PROMPT_INPUT_OPTION);
            //validation for selecting option from menu

            int optionNumber = Integer.parseInt(userInput) -1;

            if (Config.OPTIONS[optionNumber].equals(Config.OPTION_ADD_NEW_CONTACT)) {
                this.addNewContact(contactList);

                contactList.getData().get(0).printData();
            } else if (Config.OPTIONS[optionNumber].equals(Config.OPTION_QUIT)) {
                this.quit();
                break;
            }

        }
    }

    /**
     * form field:
     * name - required
     * mobile - required
     * work
     * home
     * city
     *
     * @param contactList
     */
    private void addNewContact(ContactList contactList) {
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

        contactList.addContact(newContact);
        System.out.println(Config.ADD_CONTACT_SUCCESS);
    }

    private void quit() {
        System.out.println(Config.GREETING_BYE);
    }
}
