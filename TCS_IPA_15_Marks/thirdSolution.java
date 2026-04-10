/*
String Input : experience
Output : exprinc
 */

package TCS_IPA_15_Marks;
import java.util.*;

public class thirdSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int freq[] = new int[256];
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
            if(ans.isEmpty() || freq[input.charAt(i)] == 0) {
                ans.append(input.charAt(i));
            }
            freq[input.charAt(i)]++;
        }
        System.out.print(ans);
    }
}
