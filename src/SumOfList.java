import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        while (true) {
            System.out.print("");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            myArray.add(input);
        }

//        for (int list : myArray) {
//            System.out.print(list + ",");
//        }
//    }
//    int sum = getSum(list);
//    System.out.println("were the items in the list. The sum of that list is: " + sum);
//
//            public static int getSum(ArrayList<Integer> numbers) {
//                int sum = 0;
//                for (int number : numbers) {
//                    sum += number;
//                }
//                return sum;
//            }
//    }


        for (int i = 0; i < myArray.size(); i++) {
            System.out.print(myArray.get(i));
            if (i < myArray.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" were the items in the list. The sum of that list is: " + listSum(myArray));

        scanner.close();
    }
    public static int listSum(ArrayList<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}