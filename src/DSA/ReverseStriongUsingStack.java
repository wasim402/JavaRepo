package DSA;

import java.util.Stack;

public class ReverseStriongUsingStack {
    static void main(String[] args) {
        String Name = "Wasim Akhtar";
        String Expacted = "misaW Akhtar";

//        Reverse Only first word using Array
        String []splited = Name.split(" ");
        String rev=" ";
        for(char s : splited[0].toCharArray() ) {

            rev= s+rev;
        }
//      System.out.println(rev);
        String LogicalFinal=rev+splited[1];
        System.out.println(LogicalFinal);
        System.out.println(Expacted);

        if (Expacted.equals(LogicalFinal)){
            System.out.println("You have done");
        }
        else {
            System.out.println("You need to improve yourself");
        }
//        Reverse String using Stack.
//        Stack<Character> stack= new Stack<Character>();
//
//        for (int i = 0; i <=Name.length()-1 ; i++) {
//            stack.push(Name.charAt(i));
//        }
//         while (!stack.isEmpty()){
//             rev+=stack.pop();
//        }
//        System.out.println(rev);
    }
}




