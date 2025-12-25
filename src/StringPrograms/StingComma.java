package StringPrograms;

public class StingComma {
    static void main(String[] args) {
        String s = "md,wasim,akhtar,";
        String [] Splited = s.split(",");

        for (int i = 0; i <=Splited.length-1 ; i++) {
            System.out.println(Splited[i]);
        }
    }
}


