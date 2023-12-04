// create a rock paper scissors game
// 1. ask user to input rock paper or scissors
// 2. have the computer select a random choice
// 3. compare the two choices and send out the results
// 4. ask the user if they want to play again

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // 1. ask user to input rock paper or scissors
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Please enter rock, paper, or scissors: ");
        String userChoiceString = userChoice.nextLine();
        System.out.println("You chose: " + userChoiceString);

        // 2. have the computer select a random choice
        int computerChoice = (int) (Math.random() * 3);
        String computerChoiceString = "";
        if (computerChoice == 0) {
            computerChoiceString = "rock";
        } else if (computerChoice == 1) {
            computerChoiceString = "paper";
        } else {
            computerChoiceString = "scissors";
        }

        // 3. compare the two choices and send out the results
        System.out.println("The computer chose: " + computerChoiceString);

        if (userChoiceString.equals(computerChoiceString)) {
            System.out.println("It's a tie!");
        } else if (userChoiceString.equals("rock")) {
            if (computerChoiceString.equals("paper")) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        } else if (userChoiceString.equals("paper")) {
            if (computerChoiceString.equals("scissors")) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        } else if (userChoiceString.equals("scissors")) {
            if (computerChoiceString.equals("rock")) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        } else {
            System.out.println("Invalid input!");
        }

        // 4. ask the user if they want to play again
        System.out.println("Do you want to play again? (y/n)");
        String playAgain = userChoice.nextLine();
        if (playAgain.equals("y")) {
            main(null);
        } else {
            System.out.println("Thanks for playing!");
        }

    }
}
