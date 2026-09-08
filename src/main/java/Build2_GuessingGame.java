import java.util.Random;
import java.util.Scanner;

public class Build2_GuessingGame {

    public static int printMenuReadLevel(Scanner scn) {
        System.out.println("Please choose the level");
        System.out.println("1. Easy (1–50, unlimited)" + "\n" + "2. Medium (1–100, 10 tries)" + "\n" + "3. Hard (1–200, 7 tries)");
        int level = scn.nextInt();
        return level;
    }

    public static int generateRandomNumber(int level) {
        int number;
        Random random = new Random();
        if(level == 1) {
            number = random.nextInt(50) + 1;
        } else if (level == 2) {
            number = random.nextInt(100) + 1;
        } else {
            number = random.nextInt(200) + 1;
        }
        return number;
    }

    public static boolean guessNumber(int number, int count, Scanner scn) {
        System.out.println("Please enter the number");
        int answer = scn.nextInt();
        if(answer == number) {
            System.out.println("Correct! You got it in " + count + " attempts!");
            return true;
        } else if (answer > number) {
            System.out.println("Too high");
        } else {
            System.out.println("Too low");
        }
        return false;
    }

    public static void logic(int number, int level, Scanner scn) {
        boolean flag = true;
        boolean isAnsCorrect = false;
        int count = 0;
        while(flag) {
            switch(level) {
                case 1:
                    count ++;
                    isAnsCorrect = guessNumber(number, count, scn);
                    break;
                case 2:
                    count ++;
                    if (count > 9) {
                        flag = false;
                    }
                    isAnsCorrect = guessNumber(number, count, scn);
                    break;
                case 3:
                    count ++;
                    if (count > 6) {
                        flag = false;
                    }
                    isAnsCorrect = guessNumber(number, count, scn);
                    break;
            }
            if(isAnsCorrect){
                flag = false;
            }
        }
        if(!isAnsCorrect) {
            System.out.println("Game Over! The number was " + number);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean play = true;
        String response = "";
        int gameCount = 0;

        while(play){
            int level = printMenuReadLevel(scn);
            int number = generateRandomNumber(level);
            gameCount++;
            logic(number, level, scn);
            scn.nextLine();
            System.out.println("Do you want to play again, please type yes/no");
            response = scn.nextLine();
            if(response.equalsIgnoreCase("no")) {
                play = false;
            }
        }
        System.out.println("Number of game(s) played is " + gameCount);
    }
}
