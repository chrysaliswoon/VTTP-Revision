## Project Assignment

Write a Java console program that allows a user to add, remove and list the contents of a shopping cart.

You are to implement the following commands:

[] List - list the contents of the cart. If the cart is empty, print an appropriate message. The contents of the cart should be numbered when you are listing them

[] Add - Add one or more items to the cart. Multiple items are separated by a comma(,).

[] Delete - Delete an item from the cart based on the item's index (from the list command). If an incorrect index is provided, display an error message.

## Printing ArrayList Methods

1. For Loop

```
        for (int i = 0; i < cartContents.size(); i++){
            System.out.println(cartContents.get(i));
        }
```
- Getting the length of the ArrayList using its size() method, up to which we need to retrieve the elements
- Used get(i) method of the arraylist to fetch the data present at the indexes of the arraylist

2. For-each Loop

```
        for (String str:cartContents){
            System.out.println(str);
        }
```
- Fetches every element from the arraylist object one by one

3. List Interator

```
        ListIterator litr = cartContents.listIterator();
        while(litr.hasNext()){
           System.out.println(litr.next());
        }
```
- Traverse elements of the arraylist. 
- Has methods: 
  - hasNext(): check if element is present 
  - next(): retrieve ArrayList elements
- Similar to Iterator except Iterator is unidirectional and ListIterator is bidirectional


## Console Class

- Used to read from and write to the console
- Provides methods to read text and password
  - If you read password using Console class, it will not be displayed to the user.

- Associated Methods:
  - Printwriter writer: Retrieves the unique PrintWriter object associated with this console.
  - Reader reader: Retrieves the unique Reader object associated with this console.
  - Console format: Writes a formatted string to this console's output stream using the specified format string and arguments
  - Console printf: Convenience method to write a formatted string to the console's output stream using the specified format string and arguments
  - readLine: Provides a formatted prompt, then reads a single line of text from the console.
  - readPassword: Provides a formatted prompt, then reads a password or passphrase from the console with echoing disabled
  - flush: Flushes the console and forces any buffered output to be written immediately.