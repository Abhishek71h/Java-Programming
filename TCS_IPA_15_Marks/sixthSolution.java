/*
Write a program to print the last character of every word in a string
Note : Ignore all the digits and whitespaces

Input : Hey3 Java Learners
Output : as
*/

package TCS_IPA_15_Marks;
import java.util.*;

public class sixthSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = "";
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == ' ') {
                char ch = input.charAt(i-1);
                if(!Character.isDigit(ch)) {
                    ans = ans + ch;
                }
            }
        }
        char lastChar = input.charAt(input.length()-1);
        if(!Character.isDigit(lastChar)) {
            ans = ans + lastChar;
        }
        System.out.print(ans);
    }
}
