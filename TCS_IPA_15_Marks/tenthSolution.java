/*
Find Character of a String at odd Index
Input : Management
Output : aaeet
*/

package TCS_IPA_15_Marks;
import java.util.*;

public class tenthSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = "";
        for(int i=0; i<input.length(); i++) {
            if(i%2 != 0) {
                ans = ans + input.charAt(i);
            }
        }
        System.out.print(ans);
    }
}
