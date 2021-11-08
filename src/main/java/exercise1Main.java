import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class exercise1Main {

    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
        int guessedNumber;
        int maximumGuessesAmount = 5;

        for (int i = 0; i < maximumGuessesAmount; i++) {
            System.out.println("Try to guess number in 0-99 range");
            try {
                guessedNumber = new Scanner(System.in).nextInt();

                if (numberToGuess == guessedNumber) {
                    System.out.println("You guessed it!");
                    break;
                }

                if (numberToGuess < guessedNumber) {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                } else {
                    System.out.println("Your number is LOWER than the one you are trying to guess");
                }

                if (i == 4) {
                    System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                    break;
                }

                System.out.println("You have " + (maximumGuessesAmount - i -1) + " tries");
                System.out.println("Please try again");

            } catch (InputMismatchException e) {
                if (i == 4) {
                    System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                } else {
                    System.out.println("You are allowed to enter only numbers from range 0-99. You have left " + (maximumGuessesAmount - i - 1) + " tries");
                }
            }
        }
    }
}
