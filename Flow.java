import java.util.ArrayList;

public class Flow {
    private ArrayList<String> letters;

    public Flow() {

        letters = new ArrayList<String>();
        letters.add("J");
        letters.add("a");
        letters.add("v");
        letters.add("a");
        letters.add("e");
        letters.add("r");
        letters.add("s");
        letters.add("j");
        letters.add("o");
        letters.add("v");
        letters.add("t");
    }

    public void printLetters() {
        for (String letter : letters) {
            System.out.println(letter);
        }
    }
}
