package Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by detec_000 on 7/10/2016.
 */
public class URL {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a string: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String line = read.readLine();
        String[] inputs = line.split("#");
        char[] x = inputs[0].toCharArray();
        int y = Integer.parseInt(inputs[1]);
        System.out.println("URL: " + new String(URLString(x,y)));
    }

    //Not in place
    public static char[] URLString(char[] s, int length) {
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (s[i] == ' ') {
                spaceCount++;
            }
        }
        int newLength = length + spaceCount * 2;
        char[] newArray = new char[newLength];
        int newIndex = 0;
        for(int x = 0; x < length; x++) {
            if(s[x]==' ') {
                newArray[newIndex]='%';
                newArray[newIndex+1]='2';
                newArray[newIndex+2]='0';
                newIndex += 3;
            }
            else {
                newArray[newIndex] = s[x];
                newIndex += 1;
            }
        }
        return newArray;
    }


    public static void MyURL(char[] s, int length) {
        int spaces = 0;
        for(int i = 0; i < length; i++){
            if(s[i]==' ') {
                spaces++;
            }
        }
        int newLength = length + spaces * 2 - 1;
        for(int x = length - 1; x>=0 ; x--){
            if(s[x]==' '){
                s[newLength]='0';
                s[newLength-1]='2';
                s[newLength-2]='%';
                newLength -= 3;
            }
            else {
                s[newLength]= s[x];
                newLength -= 1;
            }
        }

    }

}
