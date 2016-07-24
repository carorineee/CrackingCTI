package Chapter1;

import java.util.Scanner;

/**
 * Created by detec_000 on 7/10/2016.
 */
public class PalindromePerm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String theString = scan.next();
        System.out.println("Palindrome permutation? " + PalindromePermutation(theString));
    }

    public static boolean PalindromePermutation(String s) {
        int[] chars = new int[128];
        String s1 = s.toLowerCase();
        for(int x = 0; x < s.length(); x++) {
            if(s1.charAt(x)!=' ') {
                chars[(int) s1.charAt(x)]++;
            }
        }
        boolean hasOdd = false;
        for(int f = 0; f < 128; f++){
            if(chars[f]%2!=0) {
                return !hasOdd;
            }
        }
        return false;
    }

}
