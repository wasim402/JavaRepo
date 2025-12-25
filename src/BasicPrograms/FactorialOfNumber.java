package BasicPrograms;

public class FactorialOfNumber {
    static void main(String[] args) {
        int i =5;
        int fact=1;
        for (int j = i; j >=1 ; j--) {
            fact = fact*j;
        }
        System.out.println(fact);
    }
}
