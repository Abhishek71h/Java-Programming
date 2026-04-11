/*
Print the number of spaces in the particular String

Input : Hello what is your name
Output : 4

Condition : If the count is greater than or equal to 3 then print the count else print NA as it is
*/

package TCS_IPA_15_Marks;
import java.util.*;

public class seventhSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == ' ') {
                count++;
            }
        }
        if(count >= 3) {
            System.out.print(count);
        }
        else System.out.print("NA");
    }
}
