import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you, you see two caves.\n" +
                "In one cave, the dragon is friendly and will share his treasure with you.\n" +
                "The other dragon is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2)\n");
        int selection = input.nextInt();
        String outcome;
        if (selection == 1) {
            outcome = "Gobbles you down in one bite!\n";
        } else {
            outcome = "Offers to share his treasure with you!\n";
        }
        String story = "\nYou approach the cave...\n" +
                        "It is dark and spooky...\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\n" ;

        System.out.println(story + outcome);
    }
}
