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

        boolean isTerminated = false;

        while (!isTerminated) {

            this.printMainMenu();
            String userInput = InputCollector.getUserInput(Config.PROMPT_INPUT_OPTION);


            if (Config.OPTIONS[Integer.parseInt(userInput)].equals(Config.OPTION_ADD_NEW_CONTACT) {

            } else if (Config.OPTIONS[Integer.parseInt(userInput)].equals(Config.OPTION_QUIT)) {
                isTerminated = this.quit();
            }

        }
    }


    private boolean quit() {
        System.out.println("Bye!");
        return true;
    }
}
