import java.util.Random;
import java.util.Scanner;

public class Number_Game {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
        int score = 0;

        System.out.println("Welcome to the Guess the number Game!");

        while (playAgain) {
            int secretNumber = rand.nextInt(100)+1;  //generate random between 1 to 100
            int attempt = 0;
            boolean guessCorrectly = false;

            System.out.println("\n I've Selected a number between 1 to 100, can you guess it?");

            while (!guessCorrectly && attempt < 5) {
                System.out.print("Guess the number b/w (1-100) : ");
                int guess = sc.nextInt();
                attempt++;

                System.out.println();
                if(guess == secretNumber){
                    System.out.println("Congratulation! you have guess the right number in "+ attempt + "attempts. ");
                    guessCorrectly = true;
                    score++;
                }

                else if(guess < secretNumber){
                    System.out.println("Too low!, Try Again ");
                }
                else{
                    System.out.println("Too High!, Try Again ");
                }
            }

            if(!guessCorrectly){
                System.out.println("Sorry you have run out of attempts, The correct number was: " + secretNumber);
            }

            System.out.println("\n Your current score: " + score);
            System.out.println("\n Do want to play again? (Yes/No) ");
            String playAgaingInput = sc.next().toLowerCase();
            playAgain = playAgaingInput.equals("yes") || playAgaingInput.equals("y");
        }

        System.out.println("\nthank you for playing the Guess the number game! ");
        System.out.println("Your Final score: " + score);
    }
}