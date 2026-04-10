/*
Input : Hello world Welcome to Java
Output : Hel?o W?rld ??lcome to Jav?
 */

package TCS_IPA_15_Marks;
import java.util.*;

public class firstSolution {
    public static void main(String ags[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int freq[] = new int[256];
        StringBuilder ans = new StringBuilder();
        boolean hasDuplicate = false;

        for(char ch: input.toCharArray()) {
            if(ch == ' ') {
                ans.append(ch);
                continue;
            }

            freq[ch]++;

            if(freq[ch] == 2) {
                ans.append('?');
                hasDuplicate = true;
            }

            else {
                ans.append(ch);
            }
        }
        if(!hasDuplicate) {
            System.out.print("No duplicate present in the given string");
        }
        else {
            System.out.print(ans);
        }
    }
}
