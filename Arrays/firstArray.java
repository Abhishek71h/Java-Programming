package Arrays;

import java.util.Scanner;

public class firstArray {
    public static void main(String args[]) {
        // Array Creation
        int marks[] = new int[3];
        // How to take input in an array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        // Printing
        System.out.println("Printing Arrays marks: ");
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}   