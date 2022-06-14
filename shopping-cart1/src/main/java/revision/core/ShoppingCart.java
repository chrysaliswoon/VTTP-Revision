package revision.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ShoppingCart {
    // ? Instance variables
    private ArrayList<String> cartContents = new ArrayList<String>();

    public ShoppingCart() {
        this.cartContents = new ArrayList<>();
    }

    // ? Methods
    public void List() {
        // ? Check if the list is empty or not
        boolean emptyList = cartContents.isEmpty();

        // ? Using for loop
        //? This first checks if the cart is empty. If it is true, it will print there is nothing in the cart.
        //? Else if the cart is NOT empty, it will print out the list of items in the cart
        if (emptyList) {
            System.out.println("There is nothing in the cart");
        } else {
            for (int i = 0; i < cartContents.size(); i++) {
                System.out.printf("You have the following items in your cart: \n", cartContents);
                System.out.println(cartContents.get(i));
            }
        }

        //! The below code does not work as the if-then conditional is within the for-loop 
        // for (int i = 0; i <= cartContents.size(); i++){
        // if (emptyList) {
        // System.out.println("There is nothing in the cart");
        // }
        // else {
        // System.out.printf("You have the following items in your cart: \n",
        // cartContents);
        // System.out.println(cartContents.get(i));
        // }
        // }

        // ? Using for-each loop
        // for (String str:cartContents){
        // System.out.println(str);
        // }

        // ? Using list-iterator
        // ListIterator litr = cartContents.listIterator();
        // while(litr.hasNext()){
        // System.out.println(litr.next());
        // }
    }

    public void Add(String items) {
        System.out.printf("Adding %s to the cart \n", items);
        this.cartContents.add(items);
    }

    public void Delete(String items) {
        this.cartContents.remove(items);
        System.out.printf("Deleting %s from the cart \n", items);
    }

}
