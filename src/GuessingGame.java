import java.util.Scanner;

public class GuessingGame {
    public static void main (String[] args){
       System.out.println("Hello player, what is your name?");
       Scanner name = new Scanner(System. in);
       String namePrint = name.nextLine();
       System.out.println("Hello "+ namePrint + ", thank you for playing!");

       System.out.println( "Pick a difficulty level (1 is the easiest,and 4 for the hardest)");
       Scanner diff = new Scanner (System.in);
       int a = diff.nextInt();
       System.out.println("Guess my Secret Number !");

       Scanner input = new Scanner (System.in);
       int guess = -1;
       guess = input.nextInt();
       int NumGuess = 0;
       double x = Math.random();

       if (a == 1) {
           int secret1 = (int) (x * 10 + 1);
           System.out.println("Guess my secret number!");
           while ( guess != secret1 );
           {
               System.out.println("Guess again");
               guess = input.nextInt();
               NumGuess ++;
           }
           System.out.println("You got it! The number is" + guess +"!");
       }
       if (a == 2) {
           int w = (int) (x * 100 + 1);
       }
       if (a == 3) {
           int e = (int) (x * 1000 + 1);
       }
       if (a ==4 ) {
           int r = (int) (x * 10000 + 1);
       }
    }
}