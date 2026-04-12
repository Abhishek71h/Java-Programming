/*
Take an integer as input and Calculate the sum of its digit.
If the sum is divisible by 3, then print True, else print false
Input : 123
Output : True

Input : 1234
Output : False
*/

package TCS_IPA_15_Marks;

import java.util.Scanner;
import java.util.*;

public class eleventhSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        while(input != 0) {
            int a = input % 10;
            sum = sum + a;
            input = input/10;
        }
        if(sum % 3 == 0) {
            System.out.print("True");
        }
        else System.out.print("False");
    }
}
