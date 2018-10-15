import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("Hello Player, what is your name?");
        Scanner name = new Scanner(System.in);
        String Printname = name.nextLine();
        System.out.println("Hello " + Printname + ",thank you for playing Guessing Game!");
        int numGuess = 0;
        System.out.println("Guess my secret number from 1-100");
        Scanner Number = new Scanner(System.in);
        double x = Math.random();
        int Guess = (int) (x * 100 + 1);
        int NumGuessed = Number.nextInt();
        while (NumGuessed != Guess) {
            System.out.println("Guess again, " + Printname);
            numGuess++;
            NumGuessed = Number.nextInt();
        }
        System.out.print("Congratulations " + Printname + "! You guessed my number in " + numGuess + " tries!");
    }
}