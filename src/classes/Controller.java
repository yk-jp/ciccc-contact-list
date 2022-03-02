package classes;

public class Controller {

    public void start() {
        boolean isTerminated = false;

        while(!isTerminated) {
            isTerminated = this.quit();
        }
    }



    private boolean quit() {
        System.out.println("Bye!");
        return true;
    }
}
