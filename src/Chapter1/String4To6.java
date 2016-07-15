package Chapter1;

import java.util.Scanner;

/**
 * Created by detec_000 on 7/10/2016.
 */
public class String4To6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String theString = scan.next();
        System.out.println("Palindrome? " + PalindromePerm(theString));
    }

    public static boolean PalindromePerm(String s) {
        s = s.toLowerCase();
        int[] charCounts = new int[128];
        for(int x = 0; x < s.length(); x++) {
            char v = s.charAt(x);
            if(v != ' ') {
                charCounts[(int)v]++;
            }
        }
        int odd = 0;
        for(int y = 0; y < 128; y++){
            if(charCounts[y]%2!=0){
                odd++;
            }
            if(odd > 1){
                return false;
            }
        }
        return true;
    }

}
