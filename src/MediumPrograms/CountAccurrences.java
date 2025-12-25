package MediumPrograms;

public class CountAccurrences {
    static void main(String[] args) {
        int[] arr = {1, 3, -5, 6, 5, 9, 0, 5, 7, 9};
        int count =0;
        int target =5;
        for (int i = 0; i <=arr.length-1 ; i++) {

            if (target==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
