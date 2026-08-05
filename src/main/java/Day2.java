import java.util.Scanner;
public class Day2 {

    public static String classify(int n) {
        boolean isPrime = true;
        String result = "";
        if(n % 3 == 0){
            result = "Fizz";
        } else if (n % 5 == 0) {
            result = "Buzz";
        } else if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
        } else {
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                result = "Prime";
            } else {
                result = String.valueOf(n);
            }
        }
        return result;
    }

    public static int sumToN(int n) {
        int result = 0;
        for(int i = n; i > 0; i--) {
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //Program 1
        int score;
        System.out.println("Please enter the score");
        score = scn.nextInt();
        if(score > 100 || score < 0) {
            System.out.println("Invalid score");
        } else if (score >= 90) {
            System.out.println("A grade");
        } else if (score >= 75) {
            System.out.println("B grade");
        } else if (score >= 50) {
            System.out.println("C grade");
        } else if (score >= 35) {
            System.out.println("D grade");
        } else {
            System.out.println("F grade");
        }

        //Program 2
        for(int i = 1; i <= 50; i++){
            String res = classify(i);
            System.out.println(i + " -> " + res);
        }

        //Program 3
        int n = 4, k = 9, i = 1;
        do {
            if ((i * n) % 7 == 0) {
                i++;
                continue;
            }
            System.out.println(n + " * " + i + " = " + i*n);
            i++;
        } while(i < k);

        //Program 5
        int result = sumToN(5);
        System.out.println(result);
    }
}