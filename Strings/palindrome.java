package Strings;

import java.util.Scanner;

public class palindrome {
    public static Boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length()-1;
        while(start < end) {
            if(input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.print("Enter String to check palindrome or not: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Boolean ans = checkPalindrome(input);
        if(ans == true) {
            System.out.print("Yes String is Palindrome");
        }
        else System.out.print("No String is not a Palindrome");
    }
}
