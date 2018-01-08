import java.util.Scanner;

public class NumberGame {

    public static void main(String [] args) {
        boolean isLose = false;
        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("I have chosen a number between [1 ... 100]");
        System.out.println("Try to guess it.");

        System.out.println("random = " + randomNumber);

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left");
            int input = scanner.nextInt();

            System.out.println("You guess: " + input);
            if (input > randomNumber) {
                System.out.println("It's smaller than " + input);
            } else {
                if (input < randomNumber) {
                    System.out.println("It's larger than " + input);
                } else {
                    System.out.println("CORRECT! ... YOU WIN!");
                    isLose = true;
                    break;
                }
            }
        }

        if (!isLose) {
            System.out.println("Sorry, you lose! The answer is: " + randomNumber);
        }
    }
}
