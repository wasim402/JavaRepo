package BasicPrograms;

public class LargestNumberInArray {
    static void main(String[] args) {
        int [] a = {1,2,-13,-9,9,3,5,3,6,7};
        int largest= a[0];

        int lowest=a[0];

//        find largest
        for (int i = 0; i <=a.length-1 ; i++) {

            if (largest < a[i]) {
                largest = a[i];
            }
            if(lowest>a[i]){
                lowest=a[i];
            }
        }
            System.out.println("Largest Number : "+largest);
            System.out.println("Lowest Number : "+lowest);

        }
    }
