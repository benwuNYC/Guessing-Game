import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int NumGuess = 0;
        double x = Math.random();
        System.out.println("Hello player, what is your name?");
        Scanner name = new Scanner(System.in);
        String namePrint = name.nextLine();
        System.out.println("Hello " + namePrint + ", pick a difficulty level (1 is the easiest and 4 is the hardest).");
        Scanner diff = new Scanner(System.in);
        int a = diff.nextInt();
        if (a == 1) {
            int secret1 = (int) (x * 10 + 1);
            System.out.println("Guess my secret number from 1-10!");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            while (guess != secret1) ;
            {
                System.out.println("Guess again");
                guess = input.nextInt();
                NumGuess++;
            }
            System.out.println("You got it," + namePrint + "! The number is" + secret1 + "!");
        }
        if (a == 2) {
            int secret2 = (int) (x * 100 + 1);
            System.out.println("Guess my secret number from 1-100!");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            while (guess != secret2) ;
            {
                System.out.println("Guess again");
                guess = input.nextInt();
                NumGuess++;
            }
            System.out.println("You got it," + namePrint + "! The number is" + secret2 + "!");
        }
        if (a == 3) {
            int secret3 = (int) (x * 1000 + 1);
            System.out.println("Guess my secret number from 1-1000!");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            while (guess != secret3) ;
            {
                System.out.println("Guess again");
                guess = input.nextInt();
                NumGuess++;
            }
            System.out.println("You got it," + namePrint + "! The number is" + secret3 + "!");
        }
        if (a == 4) {
            int secret4 = (int) (x * 10000 + 1);
            System.out.println("Guess my secret number from 1-10000!");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            while (guess != secret4) ;
            {
                System.out.println("Guess again");
                guess = input.nextInt();
                NumGuess++;
            }
            System.out.println("You got it," + namePrint + "! The number is " + secret4 + "!");
        }
        System.out.println("Thank you for playing," + namePrint +".");
    }
}