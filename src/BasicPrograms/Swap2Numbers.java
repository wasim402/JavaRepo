package BasicPrograms;

public class Swap2Numbers {
    static void main(String[] args) {


        int a = 7;
        int b = 9;

//        using 3rd variable
//        int temp =a;
//        a= b;
//        b=temp;

//        without using 3rd variable
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println( "a =" + a+ " b ="+ b);


    }
}
