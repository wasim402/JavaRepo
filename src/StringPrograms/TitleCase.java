package StringPrograms;

public class TitleCase {
    static void main(String[] args) {
        String s = "wasim akhtar";

        String [] s2=s.split(" ");
        for(String s3 : s2){

            System.out.println( s3.substring(0,1).toUpperCase()+s3.substring(1));
        }

    }
}
