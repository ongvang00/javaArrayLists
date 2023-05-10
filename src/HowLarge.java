import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myArray = new ArrayList<>();

        while(true) {
            System.out.println(" ");
            String text = scanner.nextLine();
            if (text.equals("")) {
                System.out.println("The total amount of items in the list was: " + myArray.size());
                break;
            } else {
                myArray.add(text);
            }
        }
    }
}