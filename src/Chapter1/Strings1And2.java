package Chapter1;

/**
 * Created by detec_000 on 7/9/2016.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.io.BufferedReader;
import java.util.Arrays;

public class Strings1And2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a string (or 2): ");
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        String line = read.readLine();
        String[] stuff = line.split(" ");
//        System.out.println("Unique? " + IsUnique(line));
//        System.out.println("Permutation? " + EfficientPerm(stuff[0], stuff[1]));
//        int j = Integer.parseInt(stuff[1]);
    }


    public static boolean IsUnique(String s) {
        if(s.length()>256){
            return false;
        }
        boolean[] checkChars = new boolean[256];
        for(int x = 0; x < s.length(); x++){
            int val = s.charAt(x);
            if(checkChars[val]){
                return false;
            }
            checkChars[val] = true;
        }
        return true;
    }

    public static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean IsPermutation(String s1, String s2) {
        return s1.length() == s2.length() && sort(s1).equals(sort(s2));
    }

    public static boolean EfficientPerm(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int[] check = new int[128];
        for(int x = 0; x < s1.length(); x++){
            check[s1.charAt(x)]++;
        }
        for(int y = 0; y < s2.length(); y++){
            int c = s2.charAt(y);
            check[c]--;
            if(check[y]<0){
                return false;
            }
        }
        return true;
    }


}