package classes;

import java.util.Scanner;

public class InputCollector {

    public static String getUserInput(String prompt) {
        System.out.println(prompt + ":");
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        return userInput;
    }
}
