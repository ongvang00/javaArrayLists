import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<String>();

        while(true) {
            System.out.println("");
            String word = scanner.nextLine();
            if (word.equals("")) {
                System.out.println("The fifth item in the list is: " + listOfStrings.get(4));
                break;
            } else {
                listOfStrings.add(word);
            }
        }
    }
}
