import java.lang.reflect.Array;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 2) {
            System.out.println("Enter a number and add it to array");
            System.out.println("1. Enter data and continue...");
            System.out.println("2. Exit.");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number you want to add to array: ");
                    int addNumber = input.nextInt();
                    System.out.print("Enter index you want to add new number: ");
                    int addIndex = input.nextInt();
                    if (addIndex >= 0 && addIndex < myArray.length) {
                        AddElement(myArray, addNumber, addIndex);
                        for (int element : myArray) {
                            System.out.printf("%-5d", element);
                        }
                    } else {
                        System.out.println("This index out of array");
                    }
                    break;
                case 2:
                    System.exit(0);
            }
            System.out.println();
        }
    }

    public static void AddElement(int arr[], int value, int index) {
        for (int i = arr.length - 1; i < index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;

    }

}
