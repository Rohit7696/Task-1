import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1; // generate a random number between 1 and 100
        int k = 10; // number of trials that the user has to guess the number

        Scanner input = new Scanner(System.in);

        // TO check if the user has guessed the number
        boolean correct = false;
        System.out.println("I'm thinking of a number between 1 and 100.\nYou have 10 tries to guess the number.");
        while (k > 0) {
            System.out.println("Enter your guess: ");
            int guess = input.nextInt();
            // if the user guesses correctly, print the congratulation message and exit the
            if (guess == answer) {
                System.out.println("You guessed the number!\nYou win!");
                correct = true;
                break;
            } else if (guess > answer) {
                System.out.println("Your guess is too high.\nYou have " + (k - 1) + " tries left.");

            } else {
                System.out.println("Your guess is too low.\nYou have " + (k - 1) + " tries left.");
            }
            // after each trial decrease the number of trials by 1
            k--;
        }
        if (correct == false) {
            System.out.println("You ran out of tries ,|\nCorrect answer was : " + answer);
        }
    }
}