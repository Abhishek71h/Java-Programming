import java.util.Scanner;

public class average {
    public static void main(String args[]) {
        System.out.println("Program to find Average of three numbers: ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A + B + C) / 3;
        System.out.println("Average of three numbers is: " + average);
    }
}