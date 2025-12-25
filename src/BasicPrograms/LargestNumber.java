package BasicPrograms;

public class LargestNumber {
    static void main(String[] args) {
        int a = 62 , b= 18 , c= 15;

//        if (a> b && a>c){
//            System.out.println(a+" is gretest");
//        } else if (b>a && b>c) {
//
//            System.out.println(b + " is gretest");
//        }
//        else {
//            System.out.println(c +" is gretest");
//        }



        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("Largest: " + largest);

    }
}
