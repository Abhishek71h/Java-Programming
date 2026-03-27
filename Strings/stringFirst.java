package Strings;

import java.util.Scanner;

public class stringFirst {
    public static void main(String args[]) {
        // Java String are immutable
        System.out.println("Enter the Sentence you want: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);

        // How to find Lenght of String
        int len = input.length();
        System.out.println("String Lenght is: "+ len);

        // String Concatenation
        String firstName = "Abhishek";
        String lastName = "Sharma";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // charAt Method
        System.out.println(fullName.charAt(1));

        // Printing all letters
        for(int i=0; i<fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
    }
}
