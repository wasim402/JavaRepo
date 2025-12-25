package StringPrograms;

public class RemoveDuplicateChar {
    static void main(String[] args) {
        String s = "aaabssbfe"; //absfe
        char [] c4=s.toCharArray();

        String OnlyUniq="";

        for (int i = 0; i <=s.length()-1 ; i++) {
            char c = s.charAt(i);
        }
            for (int j = 0; j < s.length() - 1; j++) {


//                if (s.charAt(i)!=s.charAt(j+1)){
                    OnlyUniq+=s.charAt(j);
                }
            }
        }
//        System.out.println(OnlyUniq);

