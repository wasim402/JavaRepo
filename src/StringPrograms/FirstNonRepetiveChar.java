package StringPrograms;

public class FirstNonRepetiveChar {
    static void main(String[] args) {
        String s = "hello world";
        char c1;
        char c2;
        char[] c4;

        for (int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);

            int count = 0;
            for (int j =s.length() ;j <0; j--) {
                c2 = s.charAt(j);
                if (c1 == c2) {
                    count++;
                }
            }
            if (count == 1) {
                String s2 = String.valueOf(c1);
                c4 = s2.toCharArray();
                if (i == 2) {
                    System.out.println(c4[i]);
                }
            }
        }
    }
}

