import java.util.ArrayList;
import java.util.Scanner;

public class Day4_Calculator {
    public static void displayMenu() {
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.println("6. Square Root");
        System.out.println("7. History");
        System.out.println("8. Exit");
    }
    public static int getMenuChoice(Scanner scn) {
        System.out.println("Please choose one option from the following");
        int choice = scn.nextInt();
        return choice;
    }
    public static double[] getTwoNumbers(Scanner sc) {
        System.out.println("Please enter 2 numbers");
        double[] arr = new double[2];
        arr[0] = sc.nextDouble();
        arr[1] = sc.nextDouble();
        return arr;
    }
    public static double add(double a, double b) {
        return a+b;
    }
    public static double substract(double a, double b) {
        return a-b;
    }
    public static double multiply(double a, double b) {
        return a*b;
    }
    public static double divide(double a, double b) {
        return a/b;
    }
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }
    public static double squareRoot(double n) {
        return Math.sqrt(n);
    }
    public static ArrayList<Double> addToHistory(ArrayList<Double> list, double result) {
        list.add(result);
        if(list.size() > 5) {
            list.remove(0);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        double[] numbers;

        displayMenu();
        int choice = getMenuChoice(scn);

        while(choice != 8) {
            double result = 0;
            switch(choice) {
                case 1:
                    numbers = getTwoNumbers(scn);
                    result = add(numbers[0], numbers[1]);
                    list = addToHistory(list, result);
                    System.out.println("Result = " + result);
                    break;
                case 2:
                    numbers = getTwoNumbers(scn);
                    result = substract(numbers[0], numbers[1]);
                    list = addToHistory(list, result);
                    System.out.println("Result = " + result);
                    break;
                case 3:
                    numbers = getTwoNumbers(scn);
                    result = multiply(numbers[0], numbers[1]);
                    list = addToHistory(list, result);
                    System.out.println("Result = " + result);
                    break;
                case 4:
                    numbers = getTwoNumbers(scn);
                    if(numbers[1] == 0){
                        System.out.println("Division by 0 is invalid");
                        break;
                    }
                    result = divide(numbers[0], numbers[1]);
                    list = addToHistory(list, result);
                    System.out.println("Result = " + result);
                    break;
                case 5:
                    numbers = getTwoNumbers(scn);
                    result = power(numbers[0], numbers[1]);
                    list = addToHistory(list, result);
                    System.out.println("Result = " + result);
                    break;
                case 6:
                    numbers = getTwoNumbers(scn);
                    result = squareRoot(numbers[0]);
                    list = addToHistory(list, result);
                    System.out.println("Result = " + result);
                    break;
                case 7:
                    for(int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 8:
                    break;
                default: System.out.println("Please enter a valid option");
                    break;
            }
            displayMenu();
            choice = getMenuChoice(scn);
        }
        scn.close();
    }
}
