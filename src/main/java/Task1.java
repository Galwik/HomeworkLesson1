import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberToGuess = new Random().nextInt(100);

        System.out.println("Try to guess a number from 0 to 99:");
        for (int i = 4; i >= 0; i--) {

            int number = sc.nextInt();
            if (number == numberToGuess) {
                System.out.println("You guessed it!");
                break;
            }
            if (number < numberToGuess && i != 0) {
                System.out.println("Your number is LOWER than the one you are trying to guess");
            } else {
                System.out.println("Your number is GREATER than the one you are trying to guess");
            }
            if (i == 0) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                break;
            }
            System.out.println("You have " + i + " moves left");
            System.out.println("Please try again");
        }
    }
}