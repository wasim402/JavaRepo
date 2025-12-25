package StringPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestWordInString {
    static void main(String[] args) {
        String s = "i love coding";
        String[] s1 = s.split(" ");

        String largest ="";

        System.out.println(Arrays.toString(s1));
        for (String s2 : s1){
            System.out.println(s2 +" -> "+ s2.length());
            if( s2.length()> largest.length() ){
                largest=s2;
            }
        }
        System.out.println(largest + " is the largest word in the "+ s + " String." );

    }
}
