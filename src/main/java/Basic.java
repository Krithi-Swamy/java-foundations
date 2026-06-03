import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        int num, number, digit, rev = 0, sum = 0, count = 0;
        boolean isPrime = true, isPalindrome = false;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scn.nextInt();

        //Even or odd
        if(num % 2 == 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        //Prime or not
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number");
        } else{
            System.out.println(num + " is not a prime number");
        }

        //Sum of digits, count and is it a palindrome or not
        number = num;
        while(number > 0){
            digit = number % 10;
            count++;
            rev = rev * 10 + digit;
            sum = sum + digit;
            number = number / 10;
        }
        if(num == rev){
            isPalindrome = true;
        }
        System.out.println("The sum of digits in " + num + " is " + sum);
        System.out.println("The number of digits in " + num + " is " + count);
        if(isPalindrome){
            System.out.println(num + " is a palindrome");
        } else{
            System.out.println(num + " is not a palindrome");
        }

        //Print a pattern
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
