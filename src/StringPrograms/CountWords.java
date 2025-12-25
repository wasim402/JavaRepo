package StringPrograms;

public class CountWords {
    static void main(String[] args) {
        String s="i love coding";
        String [] s1=s.split(" ");
//        int lenght= s1.length;
//        System.out.println(lenght);

        int count =1;

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == ' ') {
                count++;

            }
        }
            System.out.println(count);
        }

    }
