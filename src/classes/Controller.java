package classes;

public class Controller {

    public void execute() {
        boolean isTerminated = false;

        while(!isTerminated) {
            String userInput = InputCollector.getUserInput(Config.PROMPT_INPUT_OPTION);

            // quit
            if(Config.OPTIONS[Integer.parseInt(userInput)].equals(Config.OPTION_QUIT)) {
                isTerminated = this.quit();
            }

        }
    }



    private boolean quit() {
        System.out.println("Bye!");
        return true;
    }
}
