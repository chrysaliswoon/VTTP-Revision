package practise.core;

public class PhraseOMatic {
    public static void main (String[] args) {
        // Creates 3 sets of words to choose from
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot"};
        String[] wordListTwo = {"empowered", "sticky", "oriented", "centric" };
        String[] wordListThree = {"process", "solution", "architecture"};

        // Find how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Generate 3 random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Print out the phrase
        System.out.println("What we need is a " + phrase);

    }
}
