import java.util.Scanner;
import java.util.Random;

// Number guessing game

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 50
        int number = random.nextInt(50) + 1; 
        int attempts = 1;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Enter a number between 1 and 50.");
        int guess = scanner.nextInt();

        while (guess != number) {
            if (guess > number) {
                System.out.println("Too high! Try a bit lower.");
            } else {
                System.out.println("Too low! Try a bit higher.");
            }

            System.out.print("Enter again: ");
            guess = scanner.nextInt();
            attempts++; //tracking no. of attempts
        }

        System.out.printf("Congratulations! You found %d in %d tries!%n", number, attempts);
        scanner.close();
    }
}
