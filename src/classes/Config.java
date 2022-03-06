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

    //menu
    final static String PROMPT_INPUT_OPTION = "Enter your option";

    //list all contact
    final static String PROMPT_ENTER_NAME = "Enter name";
    final static String PROMPT_ENTER_MOBILE = "Enter mobile";
    final static String PROMPT_ENTER_WORK = "Enter work";
    final static String PROMPT_ENTER_HOME = "Enter home";
    final static String PROMPT_ENTER_CITY = "Enter city";

    final static String[] PROMPT_CREATE_CONTACT = new String[]{
            PROMPT_ENTER_NAME,
            PROMPT_ENTER_MOBILE,
            PROMPT_ENTER_WORK,
            PROMPT_ENTER_HOME,
            PROMPT_ENTER_CITY
    };

    final static String[] PROMPT_UPDATE_CONTACT = Config.PROMPT_CREATE_CONTACT;

    //update and remove
    final static String PROMPT_ENTER_INDEX = "Enter the index of the contact to ";

    final static String NOT_FOUND = "NOT FOUND";

    final static String ERROR_MESSAGE_DUPLICATE_ENTRY(String message) {
        return "This contact already exists. " + message;
    };


    final static String ERROR_MESSAGE_OUT_OF_BOUNDS (int lowerBound, int upperBound) {
        return "Invalid input. Enter number between " + lowerBound + " and " + upperBound + ".";
    }

    final static String ERROR_MESSAGE_FORMAT (String message) {
        return "Invalid input. " + message;
    }

    final static String ERROR_MESSAGE_IS_REQUIRED() {
        return "You must enter this field";
    }
}
