package classes;

public class Controller {
    public final String[] OPTIONS = Config.OPTIONS;

    private void printMainMenu() {
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

            int optionNumber = Integer.parseInt(userInput) - 1;
            if (Config.OPTIONS[optionNumber].equals(Config.OPTION_LIST_ALL_CONTACTS)) {
                contactList.printAllData();

            } else if (Config.OPTIONS[optionNumber].equals(Config.OPTION_ADD_NEW_CONTACT)) {
                contactList.addNewContact();

            } else if(Config.OPTIONS[optionNumber].equals(Config.OPTION_REMOVE_CONTACT)){
                contactList.removeContact();

            } else if (Config.OPTIONS[optionNumber].equals(Config.OPTION_QUIT)) {
                this.quit();
                break;
            }

        }
    }

    private void quit() {
        System.out.println("Bye!");
    }
}
