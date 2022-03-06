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

        String userInput = null;
        int optionNumber = -1;

        while (true) {
            this.printMainMenu();

            try {
                userInput = InputCollector.getUserInput(Config.PROMPT_INPUT_OPTION);
                optionNumber = Integer.parseInt(userInput) - 1;

                if (optionNumber < 0 || optionNumber > Config.OPTIONS.length - 1) {
                    throw new IndexOutOfBoundsException();
                }
            } catch (IndexOutOfBoundsException err) {
                System.out.println(Config.ERROR_MESSAGE_OUT_OF_BOUNDS(1, Config.OPTIONS.length) + "\n");
                continue;
            } catch (NumberFormatException err) {
                System.out.println(Config.ERROR_MESSAGE_FORMAT("You must enter number between "
                        + 1 + " and " + Config.OPTIONS.length + ".") + "\n");
                continue;
            }

            if (Config.OPTIONS[optionNumber].equals(Config.OPTION_LIST_ALL_CONTACTS)) {
                contactList.printAllData();

            } else if (Config.OPTIONS[optionNumber].equals(Config.OPTION_ADD_NEW_CONTACT)) {
                contactList.addNewContact();

            } else if (Config.OPTIONS[optionNumber].equals(Config.OPTION_REMOVE_CONTACT)) {
                contactList.removeContact();

            } else if (Config.OPTIONS[optionNumber].equals(Config.OPTION_UPDATE_CONTACT)) {
                contactList.updateContact();

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
