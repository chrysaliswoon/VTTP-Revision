package revision.core;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Sessions {

    public void start() {
        String user;
        String userInput;

        List<String> bookDatabase = new ArrayList<>();

        // ? Obtaining a reference to the console
        Console con = System.console();

        // ? Establish a boolean condition where the default value is true
        Boolean useDatabase = true;

        while (useDatabase) {
            userInput = con.readLine("What would you like to do today: ");
            BookDatabase database = new BookDatabase("books.txt");

            if (userInput.equals("search")) {
                database.search();
            } else if (userInput.equals("count")) {
                database.count();
            } else if (userInput.equals("exit")) {
                useDatabase = false;
                break;
            } else {
                System.err.println("Please enter a valid input");
            }

        }
        System.out.printf("Thank you for using the Book Database \n");

    }
}
