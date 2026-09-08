import java.util.Scanner;

public class Basics1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        String name = "Krithi", city = "Mysore";
        int age = 30;
        double GPA = 8.83;
        System.out.println("I'm " + name + " living in " + city + " and my gpa is " + GPA + "!");


        int length = 10, width = 5;
        System.out.println("Area is " + length * width);
        System.out.println("Perimeter is " + 2 * (length + width));


        int a = 10, b = 20;
        if(a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }


        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter a name");
        String s = scn.nextLine();
        System.out.println(x + s);

    }
}
