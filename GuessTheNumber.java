import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
   	    int minRange = 1;
        int maxRange = 100;
        int flag=0;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        while (true)
         {
            if(flag==3)
            {
                System.out.println("You have lost your choices");
                break;
            }
            System.out.print("Guess a number between " + minRange + " and " + maxRange + ": ");
            int guess = scanner.nextInt();
            if (guess < targetNumber)
            {
                System.out.println("Too low! Try again.");
                flag++;
            } 
            else if (guess > targetNumber)
            {
                System.out.println("Too high! Try again.");
                flag++;
            } 
            else
            {
                System.out.println("Congratulations! You've guessed the correct number!");
                break;
            }
        }
        scanner.close();
    }
}
