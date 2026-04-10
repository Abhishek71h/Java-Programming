/*
String Input : Xplore
Character Input : r
Output : 4
 */

package TCS_IPA_15_Marks;
import java.util.*;

public class secondSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        char ch = sc.next().charAt(0);
        int ans = 0;
        for(int i=0; i<input1.length(); i++) {
            if(ch == input1.charAt(i)) {
                System.out.print(ans);
                break;
            }
            ans++;
        }
    }
}
