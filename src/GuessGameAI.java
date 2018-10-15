import java.util.Scanner;
public class GuessGameAI {
    public static void main(String[] args) {
        double x= Math.random();
        int TimesGuessed = 0;
        System.out.println("Welcome to Guessing Game AI, where I will guess your number!");
        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);
        String Printname = name.nextLine();
        System.out.println("Thank you playing, " +Printname + ".");
        System.out.println("I will guess you number and you will type higher, lower, or correct to guide me!");
        Scanner input = new Scanner(System.in);
        int high = (int) (Math.random() * 100 + 1);
        int low = 0;
        System.out.print(Printname + ",is your number " + high + " ?");
        String Userinput = input.nextLine();
        while (!Userinput.equals("correct")) {
            low = high;
            if (Userinput.equals("lower")) {
                high = (int)(x * 100 + 1);
                while (high > low) {
                    high = (int)(x * 100 + 1);
                }
                System.out.print(Printname + " ,is your number " + high + " ?");
            }
            if (Userinput.equals("higher")) {
                high = (int)(x * 100 + 1);
                while (high < low) {
                    high = (int)(x * 100 + 1);
                }
                System.out.print(Printname + " ,is your number " + high + " ?");
            }
            Userinput = input.nextLine();
        }
        System.out.print("Yay I guessed your number!");
    }
}

