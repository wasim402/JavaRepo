package StringPrograms;

public class ReverseStringInSameOrder {
    static void main(String[] args) {
        String s = "Wasim Akhatr";
        String[] s1 = s.split(" ");
        String rev1 = " ";
        String rev2 = "";

        String result="";

        for (char s2 : s1[0].toCharArray()) {
            rev1 = s2 + rev1;
        }
        System.out.println(rev1);
        for (char s2 : s1[1].toCharArray()) {
            rev2 = s2 + rev2;
        }
        System.out.println(rev2);
        System.out.println((rev1 + rev2).toCharArray());


//    optimization

        for (String s2 : s1){
            String revesre="";

            for( char c : s2.toCharArray()){
                revesre=c+revesre;
            }
            result+=revesre+" ";
        }
        System.out.println(result);
    }

}
