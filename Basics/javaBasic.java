import java.util.Scanner;

public class javaBasic {
    public static void main(String args[]) {
        // Printing in Java Program
        System.out.println("Abhishek Sharma first java program");
        // Taking integer input in Java Program
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Your input number is: ");
        System.out.println(num);
        // Taking String with spaces input in Java Program
        Scanner sc1 = new Scanner(System.in);
        String input = sc1.nextLine();
        System.out.println(input);
    }
}