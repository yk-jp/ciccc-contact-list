package classes;

public class ContactList {
    public final static String[] OPTIONS = Config.OPTIONS;

    public static void printMainMenu() {
        System.out.println("+≡≡≡   Contact  App  ≡≡≡+");
        System.out.println("| 1. " + ContactList.OPTIONS[0] + "  |");
        System.out.println("| 2. " + ContactList.OPTIONS[1] + "    |");
        System.out.println("| 3. " + ContactList.OPTIONS[2] + "     |");
        System.out.println("| 4. " + ContactList.OPTIONS[3] + "     |");
        System.out.println("| 5. " + ContactList.OPTIONS[4] + "               |");
        System.out.println("+=======================+");
    }
}
