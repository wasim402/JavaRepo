package BasicPrograms;

public class PrimeNumberTill50 {
    static void main(String[] args) {
        int sum=0;

        for (int i = 2; i <=50 ; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;

                }

            }
            if (isPrime) {
                sum+=i;
                System.out.println(i + " ");
            }
        }
            System.out.print("Total sum of Prime numbers : "+sum+ " ");
        }
    }
