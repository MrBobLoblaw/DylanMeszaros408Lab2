import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" Welcome to Rock, Paper, Scissors!");

        boolean exit = false;
        do {

            System.out.print("\n Select one of the options" +
                    "\n   1. Rock" +
                    "\n   2. Paper" +
                    "\n   3. Scissors");

            System.out.print("\n Enter your choice (1, 2, 3): ");

            boolean completed = false;

            int cmpChoice = random.nextInt(3) + 1;

            do {

                switch (Integer.parseInt(scanner.nextLine())) {

                    case 1:
                        if (cmpChoice == 1) { System.out.print("\n The game is a draw. We shall try again."); }
                        else if (cmpChoice == 2) { System.out.print("\n Sorry! You lose. Better luck next time!"); exit = true; }
                        else if (cmpChoice == 3) { System.out.print("\n Nice! You Win. Well played!"); exit = true; }
                        completed = true;
                        break;
                    case 2:
                        if (cmpChoice == 1) { System.out.print("\n Nice! You Win. Well played!"); exit = true; }
                        else if (cmpChoice == 2) { System.out.print("\n The game is a draw. We shall try again."); }
                        else if (cmpChoice == 3) { System.out.print("\n Sorry! You lose. Better luck next time!"); exit = true; }
                        completed = true;
                        break;
                    case 3:
                        if (cmpChoice == 1) { System.out.print("\n Sorry! You lose. Better luck next time!"); exit = true; }
                        else if (cmpChoice == 2) { System.out.print("\n Nice! You Win. Well played!"); exit = true; }
                        else if (cmpChoice == 3) { System.out.print("\n The game is a draw. We shall try again."); }
                        completed = true;
                        break;
                    default:
                        System.out.print("\n Invalid option! Try again: ");

                }

            } while (!completed);

        } while(!exit);

    }

}