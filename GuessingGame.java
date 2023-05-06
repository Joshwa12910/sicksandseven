import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100 + 1);
        int guess;
        int count = 0;
        System.out.println("Please guess a number between 1 and 100 or enter 'q' to give up like a chump: ");

        while (true) {
            String userInput = input.nextLine();
            if (userInput.equals("q")) {
                System.out.println("The number was: " + randomNum);
                System.out.println("Quitter! You suck!");
                break;
            }
            guess = Integer.parseInt(userInput);
            count++;

            if (guess == randomNum) {
                System.out.println("You guessed the number in " + count + " tries!");
                break;
            } else if (guess < randomNum) {
                System.out.println("Too low! Guess again: ");
            } else {
                System.out.println("Too high! Guess again: ");
            }
        }
        input.close();
    }
}