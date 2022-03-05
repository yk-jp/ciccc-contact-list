package classes;

class Config {
    final static String OPTION_LIST_ALL_CONTACTS = "List all Contacts";
    final static String OPTION_ADD_NEW_CONTACT = "Add new Contact";
    final static String OPTION_REMOVE_CONTACT = "Remove Contact";
    final static String OPTION_UPDATE_CONTACT = "Update Contact";
    final static String OPTION_QUIT = "Quit";

    final static String[] OPTIONS = new String[]{
            OPTION_LIST_ALL_CONTACTS,
            OPTION_ADD_NEW_CONTACT,
            OPTION_REMOVE_CONTACT,
            OPTION_UPDATE_CONTACT,
            OPTION_QUIT,
    };

    final static String PROMPT_INPUT_OPTION = "Enter your option";

    final static String GREETING_BYE = "Bye!";
}
