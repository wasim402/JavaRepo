package StringPrograms;

public class StringAndNumber {
    static void main(String[] args) {
        String s ="1234wasim";

        String number="";
        String string="";

        char [] c1 =s.toCharArray();
        System.out.println(c1);

        for (int i = 0; i <=c1.length-1 ; i++) {
            char c2=c1[i];
            if(c2>='0' && c2<='9'){

                number+=c2;
            }
            else {
                string+=c2;
            }

        }
        System.out.println(number);
        System.out.println(string);

//     int [] r ={1,2,3,4 , "s","w"};



        for (int i = 0; i <=s.length()-1; i++) {
            char c=s.charAt(i);
//            Object [] a =c.toCharArray();

            if(c>='0' && c<='9'){

            }
        }
    }
}
