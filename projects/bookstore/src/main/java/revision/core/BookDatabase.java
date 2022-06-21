package revision.core;

public class BookDatabase {
    //? Members
    private String fileName = "";

    //? Constructors
    public BookDatabase(String fileName) {
        this.fileName = fileName;
    }

    //? Methods
    public void search() {
        System.out.println("Searching BookDatabase...");
    }

    public void count() {
        System.out.println("Counting...");
    }

    public void exit() {
        System.out.println("Exiting the BookDatabase...");
    }
    
}
