package StringPrograms;

import java.util.Scanner;

public class NthNonRepetiveChar {
    static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your String : ");
        String s=sc.nextLine();
        System.out.print("Enter Number to find nth Unique Char : ");
        int nthNonrepetitiveChar = sc.nextInt();

        nthNonRepetitive(s,nthNonrepetitiveChar);

    }
       public static void nthNonRepetitive (String s, int nthNonrepetitiveChar ) {
           char[] c2 = new char[s.length()];
           int uindex = 0;

           for (int i = 0; i < s.length(); i++) {
               char c1 = s.charAt(i);
               int count = 0;


               for (int j = s.length() - 1; j >= 0; j--) {

                   if (s.charAt(j) == c1) {
                       count++;
                   }
               }
               if (count == 1) {
                   c2[uindex] = c1;
                   uindex++;
//                System.out.println(c1);
               }

           }
           if (nthNonrepetitiveChar <= uindex) {

               System.out.println( nthNonrepetitiveChar+ " Non Repetitive Char : "+c2[nthNonrepetitiveChar - 1]);
           }
           else {
               System.out.println("Unable to find "+ nthNonrepetitiveChar+ " Non Repetitive Char");
           }

    }
}

