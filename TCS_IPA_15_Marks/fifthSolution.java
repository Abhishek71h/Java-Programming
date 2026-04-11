/*
Write a program to compute the number of spaces and characters in string
Input : Hi I am a Student
Output : 4 13
 */

package TCS_IPA_15_Marks;
import java.util.*;

public class fifthSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == ' ') {
                count1++;
            }
            if(input.charAt(i) >= 65 && input.charAt(i) < 91) {
                count2++;
            }
            if(input.charAt(i) >= 97 && input.charAt(i) < 123) {
                count2++;
            }
        }
        System.out.print(count1);
        System.out.print(" "+count2);
    }
}
