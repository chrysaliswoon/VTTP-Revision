package revision.core;


public class Main 
{
    public static void main( String[] args )
    {
        //? Makes a dog object
        Dog d = new Dog();

        //? Uses the dot operator to set the size of the dog
        d.size = 40;

        //? and to call it's bark method
        d.bark();
    }
}
