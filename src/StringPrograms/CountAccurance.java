package StringPrograms;

public class CountAccurance {
    static void main(String[] args) {
        String s="wassimm";

        for (int i = 0; i <s.length() ; i++) {
            char c= s.charAt(i);
            int count=0;
            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(j) == c) {
                    count++;
                }
            }
            boolean isprintedBefore=false;
            for (int k = 0; k <i ; k++) {
                if (s.charAt(k)==c){
                    isprintedBefore=true;
                    break;
                }
                
            }
            if (!isprintedBefore){
                System.out.println(c +" -> " + count);
            }
        }
    }
}
