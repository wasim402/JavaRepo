package StringPrograms;

public class RemoveDuplicateChar {
    static void main(String[] args) {
        String s = "aaabssbfe"; //absfe
        char[] c4 = s.toCharArray();


        String OnlyUniq = "";

        for (int i = 0; i <= s.length() - 1; i++) {
            int count =0;
            for (int j = 0; j <i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count=1;
                }
            }
            if (count==0){
                OnlyUniq += s.charAt(i);
            }
        }
        System.out.println(OnlyUniq);
    }

}

