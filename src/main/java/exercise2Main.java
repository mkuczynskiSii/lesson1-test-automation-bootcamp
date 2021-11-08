import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise2Main {

    public static void main(String[] args) {

        System.out.println("Please enter number of elements you want an int array to be made of");
        try {
            int numberOfElements = new Scanner(System.in).nextInt();
            int[] intArray = new int[numberOfElements];

            System.out.println("Please enter " + numberOfElements + " integers for your array");

            fillIntArray(numberOfElements, intArray);

            System.out.println("Arithmetic mean for your array is: " + Arrays.stream(intArray).average().orElseThrow());
            System.out.println("Maximum integer in your array is: " + Arrays.stream(intArray).max().orElseThrow());

        } catch (InputMismatchException e) {
            System.out.println("You are allowed to enter integers only!");
            System.out.println("Please restart program");
        }
    }

    private static void fillIntArray(int numberOfElements, int[] intArray) {
        for (int i = 0; i < numberOfElements; i++) {
            intArray[i] = new Scanner(System.in).nextInt();
        }
    }
}
