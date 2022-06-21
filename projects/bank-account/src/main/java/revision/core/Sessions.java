package revision.core;

import java.io.Console;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Sessions {

    public void start() {
        // ? Declares a variable type of string called userInput
        String user;
        String userInput;
        String depositAmt;
        String withdrawAmt;
        int amount;
        List<String> transactions = new LinkedList<>();

        // ? Obtaining a reference to the console
        Console con = System.console();

        // ? Establish a boolean condition where the default value is true
        Boolean useBank = true;

        user = con.readLine("Please enter your name: ");
        con.printf("Welcome back to the Baldur's Bank, %s \n", user);

        // ? Reads a string and then display it
        while (useBank) {
            userInput = con.readLine("What transaction would you like to do today: ");

            // ? Instantiate a new bank account from the Bank Account class
            Date dateTime = new Date();
            BankAccount newUser = new BankAccount(userInput);

            if (userInput.equals("deposit")) {
                depositAmt = con.readLine("How much would you like to deposit? \n");
                amount = Integer.parseInt(depositAmt);
                newUser.deposit(amount, dateTime);
            } else if (userInput.equals("withdraw")) {
                withdrawAmt = con.readLine("How much would you like to withdraw? \n");
                amount = Integer.parseInt(withdrawAmt);
                newUser.withdraw(amount, dateTime);
            } else if (userInput.equals("list")) {
                newUser.list();
            } else if (userInput.equals("exit")) {
                useBank = false;
                break;
            } else {
                System.err.println("Please enter a valid input");
            }

        }
        System.out.printf("Thank you for using Baldur's Bank %s \n", user);
    }
}
