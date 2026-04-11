/*
Find largest word from a given string
if two string have some length then print the first one 

Input : TCS is the best Company ever
Output : Company
 */

package TCS_IPA_15_Marks;
import java.util.*;

public class eightSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] arr = input.split(" ");
        String largest = "";
        for(int i=0; i<arr.length; i++) {
            if(arr[i].length() > largest.length()) {
                largest = arr[i];
            }
        }
        System.out.print(largest);
    }
}
