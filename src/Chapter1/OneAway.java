package Chapter1;

import java.util.Scanner;

/**
 * Created by carolineshi on 7/22/16.
 */
public class OneAway {

    public static void main(String[] args) {
        System.out.println("Enter words: ");
        Scanner scan = new Scanner(System.in);
        String string1 = scan.next();
        String string2 = scan.next();
        System.out.println("One Away? " + IsOneOrLessAway(string1, string2));
    }

    public static boolean IsOneOrLessAway(String a, String b) {
        if(Math.abs(a.length()-b.length())>1){
            return false;
        }
        else if(a.length()==b.length()) {
            return IsReplace(a, b);
        }
        else if(a.length() - 1 == b.length()) {
            return IsAddOrRemove(a, b);
        }
        else {
            return IsAddOrRemove(b, a);
        }
    }

    public static boolean IsReplace(String a, String b) {
        boolean foundDiff = false;
        for(int x = 0; x < a.length(); x++){
            if(a.charAt(x)!=b.charAt(x)) {
                if (foundDiff) {
                    return false;
                }
                foundDiff = true;
            }
        }
        return true;
    }

    public static boolean IsAddOrRemove(String longer, String shorter) {
        int sIndex = 0;
        int lIndex = 0;
        boolean foundOne = false;
        for(int g = 0; g < shorter.length(); g++){
            if(shorter.charAt(sIndex)!=longer.charAt(lIndex)){
                if(foundOne){
                    return false;
                }
                foundOne = true;
                lIndex++;
            }
            sIndex++;
            lIndex++;
        }
        return true;
    }

}
