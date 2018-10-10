import java.util.Scanner;

public class GuessingGame {
    public static void main (String[] args){
       System.out.println("Hello player, what is your name?");
       Scanner name = new Scanner(System. in);
       String namePrint = name.nextLine();
       System.out.println("Hello "+ name + "Thank you for playing!");
       int NumGuess = 0;
       System.out.println( "Pick a difficulty level (1 is the easiest, and 4 for the hardest");
       Scanner diff = new Scanner (System.in);
       int a = diff.nextLine();
       if (a == 1){
           int x = Math.random();


       }


    }
}
