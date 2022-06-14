package revision.core;

import java.io.*;

public class Main 
{
    public static void main( String[] args )
    {
        //? Declares a variable type of string called userInput
        String userInput;
        
        //? Instantiate a new shopping cart from the Shopping Cart class
        ShoppingCart cart = new ShoppingCart();

        //? Obtaining a reference to the console
        Console con = System.console();

        //? Reads a string and then display it
        userInput = con.readLine("Please enter your name: ");
        con.printf("Welcome back to the shopping cart, %s \n", userInput);

        //? Read password and display it
        // System.out.println("Enter your password: ");
        char[] ch=con.readPassword("Enter your password: ");

        //? Converting the char array into a string
        String password = String.valueOf(ch);
        System.out.printf("Password is: %s \n", password);

        //? Reads a string and then adds it to the cart
        cart.List();

        userInput = con.readLine("Please enter add an item: ");
        cart.Add(userInput);

        // //? Lists the items in the cart
        cart.List();

    }
}
