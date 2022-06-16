package revision.core;

import java.io.*;

/*
This contains all the start method to begin the shopping cart program using conditional statements
*/

public class Sessions {

  //? Methods

  public void start() {
    //? Declares a variable type of string called userInput
    String userInput;

    //? Instantiate a new shopping cart from the Shopping Cart class
    ShoppingCart cart = new ShoppingCart();

    //? Obtaining a reference to the console
    Console con = System.console();

    //? Establish a boolean condition where the default value is true
    Boolean useCart = true;

    //? Reads a string and then display it
    userInput = con.readLine("Please enter your name: ");
    con.printf("Welcome back to the shopping cart, %s \n", userInput);

    //? Read password and display it
    // System.out.println("Enter your password: ");
    char[] ch = con.readPassword("Enter your password: ");

    //? Converting the char array into a string
    String password = String.valueOf(ch);
    System.out.printf("Password is: %s \n", password);

    while (useCart) {
      String input = con.readLine("> ");
      //? Split returns an array of string
      String[] terms = input.split(" ");
      String command = terms[0];

      //? Lists the items in the cart
      if (command.equals("list")) {
        cart.list();

        //? Reads a string and then adds it to the cart
      } else if (command.equals("add")) {
        userInput = con.readLine("Add an item: ");
        cart.add(userInput);

        //? Delete the items in the cart
      } else if (command.equals("delete")) {
        userInput = con.readLine("Delete an item: ");
        cart.delete(userInput);

      } else if (command.equals("exit")) {
        useCart = false;
        break;

      } else {
        System.err.println("Please enter a valid input");
      }
    }
    System.out.println("Exiting the program....");
  }
}
