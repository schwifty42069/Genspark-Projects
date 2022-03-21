import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Defining an instance of a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        // Storyline prompt for the user
        System.out.println("You are in a land full of dragons. In front of you, you see two caves.\n" +
                "In one cave, the dragon is friendly and will share his treasure with you.\n" +
                "The other dragon is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2)\n");
        // Specifying that the input from the user will be an integer
        int selection = input.nextInt();
        // Defining an instance of a String object to hold the outcome
        String outcome;
        // Conditional logic for choosing which text should be displayed based on the user input
        if (selection == 1) {
            outcome = "Gobbles you down in one bite!\n";
        } else {
            outcome = "Offers to share his treasure with you!\n";
        }
        // Defining a string object to hold the rest of the story text
        String story = "\nYou approach the cave...\n" +
                        "It is dark and spooky...\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\n" ;

        // Printing out the end result for the user
        System.out.println(story + outcome);
    }
}
