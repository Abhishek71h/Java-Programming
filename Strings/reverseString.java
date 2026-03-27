package Strings;

import java.util.Scanner;

public class reverseString {
    public static String reverse(String input) {
        String ans = "";
        for(int i=input.length()-1; i>=0; i--) {
            ans = ans + input.charAt(i);
        }
        return ans;
    }
    public static void main(String args[]) {
        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String ans = reverse(input);
        System.out.print("Reverse String is: " + ans);
    }
}
