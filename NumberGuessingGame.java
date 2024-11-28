
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--------------------------------------------------------");
        System.out.println("NEW GAME");
        System.out.println("--------------------------------------------------------");
        System.out.println("Pick a number between 1-100! You will get 5 turns");

        
        int numberToGuess = random.nextInt(100) + 1;

        int low = 1; 
        int high = 100; 
        int attempts = 5; 
        int guess;

        for (int i = 1; i <= attempts; i++) {
            System.out.println("\nPick a number between " + low + "-" + high + " and turns left " + (attempts - i + 1));
            guess = scanner.nextInt();
            System.out.println("Player guesses " + guess);

            if (guess == numberToGuess) {
                System.out.println("\nYOU WIN! The SECRET number was " + numberToGuess);
                break;
            } else if (guess < numberToGuess) {
                System.out.println("\nSorry, that is too low");
                low = guess + 1; 
            } else {
                System.out.println("\nSorry, that number is too high");
                high = guess - 1; 
            }

            if (i == attempts) {
                System.out.println("\nGAME OVER! The SECRET number was " + numberToGuess);
            }
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("NEW GAME");
        System.out.println("--------------------------------------------------------");

        scanner.close();
    }
}
