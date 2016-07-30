package Chapter1;

import java.util.Scanner;

import static Chapter1.StringCompression.countCompress;

/**
 * Created by carolineshi on 7/24/16.
 */
public class StringCompression {

    public static void main(String[] args) {
        System.out.println("Enter words: ");
        Scanner scan = new Scanner(System.in);
        String string1 = scan.next();
        System.out.println(countCompress(string1));
        System.out.println("String compression:  " + compress(string1));
    }

    public static String StringCompression(String s) {
        String compressed = "";

        int count = 1;
        for(int d = 0; d < s.length(); d++){
            if(d+1 >=s.length() || s.charAt(d+1) != s.charAt(d)) {
                compressed += s.charAt(d) + Integer.toString(count);
                count = 1;
            }
            else {
                count++;
            }
        }
        return compressed.length() < s.length() ? compressed : s;
    }

    public static String compress(String s) {
        int finalLength = countCompress(s);
        if(finalLength>s.length()) return s;

        StringBuilder compressed = new StringBuilder(finalLength);

        int countConsecutive = 0;
        for(int x = 0; x<s.length(); x++){
            countConsecutive++;
            if(x+1 >= s.length() || s.charAt(x+1) != s.charAt(x)) {
                compressed.append(s.charAt(x));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.toString();
    }

    public static int countCompress(String s) {
        int compressedLength = 1;

        for(int f = 0; f < s.length(); f++){
            if(f+1 >= s.length() || s.charAt(f+1) != s.charAt(f)){
                compressedLength++;
            }
        }

        return compressedLength;
    }

}
