import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean playing = true;
        while (playing) {
            int attempts = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Hello! What is your name?\n");
            String name = input.nextLine();
            System.out.printf("Well, %s, I am thinking of a number between 1 and 20\n%n", name);
            int answer = 1 + (int) (Math.random() * ((20 - 1) + 1));
            while (true) {
                if (attempts < 6) {
                    System.out.println("Take a guess.\n");
                    int guess = input.nextInt();
                    attempts++;
                    if (guess < answer) {
                        System.out.println("Your guess is too low.\n");
                    } else if (guess > answer) {
                        System.out.println("Your guess is too high.\n");
                    } else {
                        System.out.printf("Good job %s! You guessed my number in %d guesses. Would you like to play again?%n", name, attempts);
                        String again = input.next();
                        if (again.equals("n") || again.equals("N")) {
                            break;
                        }
                        answer = 1 + (int) (Math.random() * ((20 - 1) + 1));
                        attempts = 0;
                    }
                } else {
                    System.out.println("You're out of guesses! Try again?\n");
                    String again = input.next();
                    if (again.equals("n") || again.equals("N")) {
                        break;
                    }
                    answer = 1 + (int) (Math.random() * ((20 - 1) + 1));
                    attempts = 0;
                }
                playing = false;
            }
        }
    }
}
