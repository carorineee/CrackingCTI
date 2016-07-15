package Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by detec_000 on 7/10/2016.
 */
public class URL {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a string: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String line = read.readLine();
        String[] stuff = line.split(" ");
        char[] x = line.toCharArray();
        URLChar(x, 13);
        System.out.println("URL: " + line);
    }

    //TODO: Finish URL problem
    //this is not in place
    public static void URLString(String s, int length) {
        char[] sArray = s.toCharArray();
        char[] copy = sArray;
        int spaceCount = 0;
        int newLength;
        for (i = 0; i < length; i++) {
            if (s[i] == ' ') {
                spaceCount++;
            }
        }
        newLength = length + spaceCount * 2;
        for(int x = 0; x < sArray.length; x++) {
            if(sArray[x]==' '){
                sArray[x]='%';
                sArray[x+1]='2';
                sArray[x+2]='0';

            }
        }
    }

    public static void URLChar(char[] s, int length) {
        int spaceCount = 0, newLength, i;
        for (i = 0; i < length; i++) {
            if (s[i] == ' ') {
                spaceCount++;
            }
        }
        newLength = length + spaceCount * 2;
        for (i = length - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                s[newLength - 1] = '0';
                s[newLength - 2] = '2';
                s[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                s[newLength - 1] = s[i];
                newLength = newLength - 1;
            }
        }
    }
}
