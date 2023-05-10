import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myArray = new ArrayList<>();

        while(true) {
            System.out.println("");
            String word = scanner.nextLine();
            if (word.equals("")) {
                System.out.println("The last item in the list: " + myArray.get(myArray.size()-1));
                break;
            } else {
                myArray.add(word);
            }
        }
    }
}
