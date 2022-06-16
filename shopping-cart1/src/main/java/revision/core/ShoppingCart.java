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
  public void list() {
    // ? Check if the list is empty or not
    boolean emptyList = cartContents.isEmpty();

    // ? Using for loop
    //? This first checks if the cart is empty. If it is true, it will print there is nothing in the cart.
    //? Else if the cart is NOT empty, it will print out the list of items in the cart
    if (emptyList) {
      System.out.println("There is nothing in the cart");
    } else {
      System.out.printf("You have the following items in your cart:\n");
      for (int i = 0; i < cartContents.size(); i++) {
        System.out.printf("%d: %s \n", i, cartContents.get(i));
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

  public void add(String items) {
    String[] itemList = items.split(",");
    for (int i = 0; i < itemList.length; i++) {
      if (cartContents.contains(itemList[i])) {
        System.out.printf("Item exists in the cart \n");
      } else {
        this.cartContents.add(itemList[i]);
        System.out.printf("Adding %s to the cart \n", itemList[i]);
      }
    }
  }

  public void delete(String itemIndex) {
    int item = Integer.parseInt(itemIndex);
    if (item >= cartContents.size() || item < 0) {
      System.out.printf("Index does not exist \n");
    } else {
      this.cartContents.remove(item);
      System.out.printf("Deleting %d from the cart \n", item);
    }
  }
}
