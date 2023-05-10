import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myArray = new ArrayList<>();

        while(true) {
            System.out.println(" ");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Done entering integers into list");
                break;
            } else {
                myArray.add(number);
            }
        }

        System.out.println("What number are you looking for in the list?");

        int findNumber = scanner.nextInt();

        for (int i = 0; i < myArray.size(); i++) {
            if(findNumber == myArray.get(i)) {
                System.out.println(findNumber + " is at index " + i);
            }
        }
    }
}
