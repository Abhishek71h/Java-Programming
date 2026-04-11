/*
Input String : DataBaSe
Output : 5
*/

package TCS_IPA_15_Marks;
import java.util.*;

public class fourthSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) >= 97 && input.charAt(i) < 123) {
                count++;
            }
        }
        System.out.print(count);
    }
}
