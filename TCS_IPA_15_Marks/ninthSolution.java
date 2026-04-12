/*
Enter a String and Print all vowel as it is which is available on the string in the 0 index
Input : Hello I am a Student
Output : Iaa    
*/

package TCS_IPA_15_Marks;
import java.util.*;

public class ninthSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        String ans = "";
        for(int i=0; i<arr.length; i++) {
            String word = arr[i];
            char ch = word.charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                ans = ans + ch;
            }
        }
        System.out.print(ans);
    }  
}
